/**
 * Copyright © 2014-2020 The SiteWhere Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.sitewhere.k8s;

import java.util.HashMap;
import java.util.Map;

import com.google.common.base.CaseFormat;

import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.dsl.MixedOperation;
import io.fabric8.kubernetes.client.dsl.Resource;
import io.fabric8.kubernetes.internal.KubernetesDeserializer;
import io.sitewhere.k8s.api.ISiteWhereKubernetesClient;
import io.sitewhere.k8s.crd.ApiConstants;
import io.sitewhere.k8s.crd.ResourceContexts;
import io.sitewhere.k8s.crd.ResourceLabels;
import io.sitewhere.k8s.crd.exception.SiteWhereK8sException;
import io.sitewhere.k8s.crd.instance.DoneableSiteWhereInstance;
import io.sitewhere.k8s.crd.instance.SiteWhereInstance;
import io.sitewhere.k8s.crd.instance.SiteWhereInstanceList;
import io.sitewhere.k8s.crd.instance.configuration.DoneableInstanceConfigurationTemplate;
import io.sitewhere.k8s.crd.instance.configuration.InstanceConfigurationTemplate;
import io.sitewhere.k8s.crd.instance.configuration.InstanceConfigurationTemplateList;
import io.sitewhere.k8s.crd.instance.dataset.DoneableInstanceDatasetTemplate;
import io.sitewhere.k8s.crd.instance.dataset.InstanceDatasetTemplate;
import io.sitewhere.k8s.crd.instance.dataset.InstanceDatasetTemplateList;
import io.sitewhere.k8s.crd.microservice.DoneableSiteWhereMicroservice;
import io.sitewhere.k8s.crd.microservice.SiteWhereMicroservice;
import io.sitewhere.k8s.crd.microservice.SiteWhereMicroserviceList;
import io.sitewhere.k8s.crd.tenant.DoneableSiteWhereTenant;
import io.sitewhere.k8s.crd.tenant.SiteWhereTenant;
import io.sitewhere.k8s.crd.tenant.SiteWhereTenantList;
import io.sitewhere.k8s.crd.tenant.configuration.DoneableTenantConfigurationTemplate;
import io.sitewhere.k8s.crd.tenant.configuration.TenantConfigurationTemplate;
import io.sitewhere.k8s.crd.tenant.configuration.TenantConfigurationTemplateList;
import io.sitewhere.k8s.crd.tenant.dataset.DoneableTenantDatasetTemplate;
import io.sitewhere.k8s.crd.tenant.dataset.TenantDatasetTemplate;
import io.sitewhere.k8s.crd.tenant.dataset.TenantDatasetTemplateList;
import io.sitewhere.k8s.crd.tenant.engine.DoneableSiteWhereTenantEngine;
import io.sitewhere.k8s.crd.tenant.engine.SiteWhereTenantEngine;
import io.sitewhere.k8s.crd.tenant.engine.SiteWhereTenantEngineList;
import io.sitewhere.k8s.crd.tenant.engine.SiteWhereTenantEngineSpec;
import io.sitewhere.k8s.crd.tenant.engine.configuration.DoneableTenantEngineConfigurationTemplate;
import io.sitewhere.k8s.crd.tenant.engine.configuration.TenantEngineConfigurationTemplate;
import io.sitewhere.k8s.crd.tenant.engine.configuration.TenantEngineConfigurationTemplateList;
import io.sitewhere.k8s.crd.tenant.engine.dataset.DoneableTenantEngineDatasetTemplate;
import io.sitewhere.k8s.crd.tenant.engine.dataset.TenantEngineDatasetTemplate;
import io.sitewhere.k8s.crd.tenant.engine.dataset.TenantEngineDatasetTemplateList;
import io.sitewhere.k8s.crd.tenant.scripting.DoneableSiteWhereScript;
import io.sitewhere.k8s.crd.tenant.scripting.SiteWhereScript;
import io.sitewhere.k8s.crd.tenant.scripting.SiteWhereScriptList;
import io.sitewhere.k8s.crd.tenant.scripting.category.DoneableSiteWhereScriptCategory;
import io.sitewhere.k8s.crd.tenant.scripting.category.SiteWhereScriptCategory;
import io.sitewhere.k8s.crd.tenant.scripting.category.SiteWhereScriptCategoryList;
import io.sitewhere.k8s.crd.tenant.scripting.template.DoneableSiteWhereScriptTemplate;
import io.sitewhere.k8s.crd.tenant.scripting.template.SiteWhereScriptTemplate;
import io.sitewhere.k8s.crd.tenant.scripting.template.SiteWhereScriptTemplateList;
import io.sitewhere.k8s.crd.tenant.scripting.version.DoneableSiteWhereScriptVersion;
import io.sitewhere.k8s.crd.tenant.scripting.version.SiteWhereScriptVersion;
import io.sitewhere.k8s.crd.tenant.scripting.version.SiteWhereScriptVersionList;

/**
 * Adds interactions with SiteWhere-specific resource to fabric8 k8s Java
 * client.
 */
public class SiteWhereKubernetesClient implements ISiteWhereKubernetesClient {

    /** Wrapped client */
    private KubernetesClient client;

    static {
	register(SiteWhereInstance.class);
	register(InstanceConfigurationTemplate.class);
	register(InstanceDatasetTemplate.class);
	register(SiteWhereMicroservice.class);
	register(SiteWhereTenant.class);
	register(TenantConfigurationTemplate.class);
	register(TenantDatasetTemplate.class);
	register(SiteWhereTenantEngine.class);
	register(TenantEngineConfigurationTemplate.class);
	register(TenantEngineDatasetTemplate.class);
	register(SiteWhereScriptTemplate.class);
	register(SiteWhereScript.class);
	register(SiteWhereScriptVersion.class);
    }

    public SiteWhereKubernetesClient(KubernetesClient client) {
	this.client = client;
    }

    /**
     * Register a custom resource.
     * 
     * @param clazz
     */
    protected static <C extends CustomResource> void register(Class<C> clazz) {
	String fullVersion = String.format("%s/%s", ApiConstants.SITEWHERE_API_GROUP,
		ApiConstants.SITEWHERE_API_VERSION);
	KubernetesDeserializer.registerCustomKind(fullVersion, clazz.getSimpleName(), clazz);
    }

    /*
     * @see io.sitewhere.k8s.crd.ISiteWhereKubernetesClient#getInstances()
     */
    public MixedOperation<SiteWhereInstance, SiteWhereInstanceList, DoneableSiteWhereInstance, Resource<SiteWhereInstance, DoneableSiteWhereInstance>> getInstances() {
	return getClient().customResources(ResourceContexts.INSTANCE_CONTEXT, SiteWhereInstance.class,
		SiteWhereInstanceList.class, DoneableSiteWhereInstance.class);
    }

    /*
     * @see io.sitewhere.k8s.crd.ISiteWhereKubernetesClient#getMicroservices()
     */
    public MixedOperation<SiteWhereMicroservice, SiteWhereMicroserviceList, DoneableSiteWhereMicroservice, Resource<SiteWhereMicroservice, DoneableSiteWhereMicroservice>> getMicroservices() {
	return getClient().customResources(ResourceContexts.MICROSERVICE_CONTEXT, SiteWhereMicroservice.class,
		SiteWhereMicroserviceList.class, DoneableSiteWhereMicroservice.class);
    }

    /*
     * @see io.sitewhere.k8s.crd.ISiteWhereKubernetesClient#
     * getInstanceConfigurationTemplates()
     */
    public MixedOperation<InstanceConfigurationTemplate, InstanceConfigurationTemplateList, DoneableInstanceConfigurationTemplate, Resource<InstanceConfigurationTemplate, DoneableInstanceConfigurationTemplate>> getInstanceConfigurationTemplates() {
	return getClient().customResources(ResourceContexts.INSTANCE_CONFIG_TEMPLATE_CONTEXT,
		InstanceConfigurationTemplate.class, InstanceConfigurationTemplateList.class,
		DoneableInstanceConfigurationTemplate.class);
    }

    /*
     * @see
     * io.sitewhere.k8s.crd.ISiteWhereKubernetesClient#getInstanceDatasetTemplates()
     */
    @Override
    public MixedOperation<InstanceDatasetTemplate, InstanceDatasetTemplateList, DoneableInstanceDatasetTemplate, Resource<InstanceDatasetTemplate, DoneableInstanceDatasetTemplate>> getInstanceDatasetTemplates() {
	return getClient().customResources(ResourceContexts.INSTANCE_DATASET_TEMPLATE_CONTEXT,
		InstanceDatasetTemplate.class, InstanceDatasetTemplateList.class,
		DoneableInstanceDatasetTemplate.class);
    }

    /*
     * @see io.sitewhere.k8s.crd.ISiteWhereKubernetesClient#getTenants()
     */
    public MixedOperation<SiteWhereTenant, SiteWhereTenantList, DoneableSiteWhereTenant, Resource<SiteWhereTenant, DoneableSiteWhereTenant>> getTenants() {
	return getClient().customResources(ResourceContexts.TENANT_CONTEXT, SiteWhereTenant.class,
		SiteWhereTenantList.class, DoneableSiteWhereTenant.class);
    }

    /*
     * @see io.sitewhere.k8s.crd.ISiteWhereKubernetesClient#
     * getTenantConfigurationTemplates()
     */
    public MixedOperation<TenantConfigurationTemplate, TenantConfigurationTemplateList, DoneableTenantConfigurationTemplate, Resource<TenantConfigurationTemplate, DoneableTenantConfigurationTemplate>> getTenantConfigurationTemplates() {
	return getClient().customResources(ResourceContexts.TENANT_CONFIG_TEMPLATE_CONTEXT,
		TenantConfigurationTemplate.class, TenantConfigurationTemplateList.class,
		DoneableTenantConfigurationTemplate.class);
    }

    /*
     * @see
     * io.sitewhere.k8s.crd.ISiteWhereKubernetesClient#getTenantDatasetTemplates()
     */
    @Override
    public MixedOperation<TenantDatasetTemplate, TenantDatasetTemplateList, DoneableTenantDatasetTemplate, Resource<TenantDatasetTemplate, DoneableTenantDatasetTemplate>> getTenantDatasetTemplates() {
	return getClient().customResources(ResourceContexts.TENANT_DATASET_TEMPLATE_CONTEXT,
		TenantDatasetTemplate.class, TenantDatasetTemplateList.class, DoneableTenantDatasetTemplate.class);
    }

    /*
     * @see io.sitewhere.k8s.crd.ISiteWhereKubernetesClient#getTenantEngines()
     */
    public MixedOperation<SiteWhereTenantEngine, SiteWhereTenantEngineList, DoneableSiteWhereTenantEngine, Resource<SiteWhereTenantEngine, DoneableSiteWhereTenantEngine>> getTenantEngines() {
	return getClient().customResources(ResourceContexts.TENANT_ENGINE_CONTEXT, SiteWhereTenantEngine.class,
		SiteWhereTenantEngineList.class, DoneableSiteWhereTenantEngine.class);
    }

    /*
     * @see io.sitewhere.k8s.crd.ISiteWhereKubernetesClient#
     * getTenantEngineConfigurationTemplates()
     */
    public MixedOperation<TenantEngineConfigurationTemplate, TenantEngineConfigurationTemplateList, DoneableTenantEngineConfigurationTemplate, Resource<TenantEngineConfigurationTemplate, DoneableTenantEngineConfigurationTemplate>> getTenantEngineConfigurationTemplates() {
	return getClient().customResources(ResourceContexts.TENANT_ENGINE_CONFIG_TEMPLATE_CONTEXT,
		TenantEngineConfigurationTemplate.class, TenantEngineConfigurationTemplateList.class,
		DoneableTenantEngineConfigurationTemplate.class);
    }

    /**
     * Gets context for operating on SiteWhere tenant engine dataset templates.
     * 
     * @return
     */
    /*
     * @see io.sitewhere.k8s.crd.ISiteWhereKubernetesClient#
     * getTenantEngineDatasetTemplates()
     */
    public MixedOperation<TenantEngineDatasetTemplate, TenantEngineDatasetTemplateList, DoneableTenantEngineDatasetTemplate, Resource<TenantEngineDatasetTemplate, DoneableTenantEngineDatasetTemplate>> getTenantEngineDatasetTemplates() {
	return getClient().customResources(ResourceContexts.TENANT_ENGINE_DATASET_TEMPLATE_CONTEXT,
		TenantEngineDatasetTemplate.class, TenantEngineDatasetTemplateList.class,
		DoneableTenantEngineDatasetTemplate.class);
    }

    /*
     * @see io.sitewhere.k8s.crd.ISiteWhereKubernetesClient#getScriptCategories()
     */
    @Override
    public MixedOperation<SiteWhereScriptCategory, SiteWhereScriptCategoryList, DoneableSiteWhereScriptCategory, Resource<SiteWhereScriptCategory, DoneableSiteWhereScriptCategory>> getScriptCategories() {
	return getClient().customResources(ResourceContexts.SCRIPT_CATEGORY_CONTEXT, SiteWhereScriptCategory.class,
		SiteWhereScriptCategoryList.class, DoneableSiteWhereScriptCategory.class);
    }

    /*
     * @see io.sitewhere.k8s.crd.ISiteWhereKubernetesClient#getScriptTemplates()
     */
    @Override
    public MixedOperation<SiteWhereScriptTemplate, SiteWhereScriptTemplateList, DoneableSiteWhereScriptTemplate, Resource<SiteWhereScriptTemplate, DoneableSiteWhereScriptTemplate>> getScriptTemplates() {
	return getClient().customResources(ResourceContexts.SCRIPT_TEMPLATE_CONTEXT, SiteWhereScriptTemplate.class,
		SiteWhereScriptTemplateList.class, DoneableSiteWhereScriptTemplate.class);
    }

    /*
     * @see io.sitewhere.k8s.crd.ISiteWhereKubernetesClient#getScripts()
     */
    @Override
    public MixedOperation<SiteWhereScript, SiteWhereScriptList, DoneableSiteWhereScript, Resource<SiteWhereScript, DoneableSiteWhereScript>> getScripts() {
	return getClient().customResources(ResourceContexts.SCRIPT_CONTEXT, SiteWhereScript.class,
		SiteWhereScriptList.class, DoneableSiteWhereScript.class);
    }

    /*
     * @see io.sitewhere.k8s.crd.ISiteWhereKubernetesClient#getScriptsVersions()
     */
    @Override
    public MixedOperation<SiteWhereScriptVersion, SiteWhereScriptVersionList, DoneableSiteWhereScriptVersion, Resource<SiteWhereScriptVersion, DoneableSiteWhereScriptVersion>> getScriptsVersions() {
	return getClient().customResources(ResourceContexts.SCRIPT_VERSION_CONTEXT, SiteWhereScriptVersion.class,
		SiteWhereScriptVersionList.class, DoneableSiteWhereScriptVersion.class);
    }

    /*
     * @see io.sitewhere.k8s.crd.ISiteWhereKubernetesClient#getFunctionalArea(io.
     * sitewhere.k8s.crd.microservice.SiteWhereMicroservice)
     */
    @Override
    public String getFunctionalArea(SiteWhereMicroservice microservice) {
	String functionalArea = microservice.getMetadata().getLabels()
		.get(ResourceLabels.LABEL_SITEWHERE_FUNCTIONAL_AREA);
	if (functionalArea == null) {
	    throw new RuntimeException(String.format("Microservice '%s' does not have a functional area label.",
		    microservice.getMetadata().getName()));
	}
	return functionalArea;
    }

    /*
     * @see
     * io.sitewhere.k8s.crd.ISiteWhereKubernetesClient#getAllMicroservices(java.lang
     * .String)
     */
    @Override
    public SiteWhereMicroserviceList getAllMicroservices(String namespace) {
	return getMicroservices().inNamespace(namespace).list();
    }

    /*
     * @see
     * io.sitewhere.k8s.crd.ISiteWhereKubernetesClient#getMicroserviceForIdentifier(
     * java.lang.String, java.lang.String)
     */
    @Override
    public SiteWhereMicroservice getMicroserviceForIdentifier(String namespace, String identifier) {
	SiteWhereMicroserviceList list = getAllMicroservices(namespace);
	for (SiteWhereMicroservice microservice : list.getItems()) {
	    if (getFunctionalArea(microservice).equals(identifier)) {
		return microservice;
	    }
	}
	return null;
    }

    /*
     * @see io.sitewhere.k8s.crd.ISiteWhereKubernetesClient#getAllTenants(java.lang.
     * String)
     */
    @Override
    public SiteWhereTenantList getAllTenants(String namespace) {
	return getTenants().inNamespace(namespace).list();
    }

    /*
     * @see
     * io.sitewhere.k8s.crd.ISiteWhereKubernetesClient#getTenantForToken(java.lang.
     * String, java.lang.String)
     */
    @Override
    public SiteWhereTenant getTenantForToken(String namespace, String token) {
	SiteWhereTenantList list = getAllTenants(namespace);
	for (SiteWhereTenant tenant : list.getItems()) {
	    if (tenant.getMetadata().getName().equals(token)) {
		return tenant;
	    }
	}
	return null;
    }

    /*
     * @see io.sitewhere.k8s.crd.ISiteWhereKubernetesClient#
     * getTenantEnginesForTenantByMicroservice(io.sitewhere.k8s.crd.tenant.
     * SiteWhereTenant)
     */
    @Override
    public Map<String, SiteWhereTenantEngine> getTenantEnginesForTenantByMicroservice(SiteWhereTenant tenant) {
	SiteWhereTenantEngineList list = getTenantEngines().inNamespace(tenant.getMetadata().getNamespace())
		.withLabel(ResourceLabels.LABEL_SITEWHERE_TENANT, tenant.getMetadata().getName()).list();
	Map<String, SiteWhereTenantEngine> byMicroservice = new HashMap<>();
	for (SiteWhereTenantEngine engine : list.getItems()) {
	    String microservice = engine.getMetadata().getLabels().get(ResourceLabels.LABEL_SITEWHERE_MICROSERVICE);
	    if (microservice != null) {
		byMicroservice.put(microservice, engine);
	    }
	}
	return byMicroservice;
    }

    /*
     * @see io.sitewhere.k8s.crd.ISiteWhereKubernetesClient#
     * getTenantEnginesForMicroserviceByTenant(io.sitewhere.k8s.crd.microservice.
     * SiteWhereMicroservice)
     */
    @Override
    public Map<String, SiteWhereTenantEngine> getTenantEnginesForMicroserviceByTenant(
	    SiteWhereMicroservice microservice) {
	SiteWhereTenantEngineList list = getTenantEngines().inNamespace(microservice.getMetadata().getNamespace())
		.withLabel(ResourceLabels.LABEL_SITEWHERE_MICROSERVICE, microservice.getMetadata().getName()).list();
	Map<String, SiteWhereTenantEngine> byMicroservice = new HashMap<>();
	for (SiteWhereTenantEngine engine : list.getItems()) {
	    String tenantId = engine.getMetadata().getLabels().get(ResourceLabels.LABEL_SITEWHERE_TENANT);
	    if (tenantId != null) {
		byMicroservice.put(tenantId, engine);
	    }
	}
	return byMicroservice;
    }

    /*
     * @see io.sitewhere.k8s.crd.ISiteWhereKubernetesClient#
     * getTenantEngineConfigurationTemplate(io.sitewhere.k8s.crd.tenant.
     * SiteWhereTenant, io.sitewhere.k8s.crd.microservice.SiteWhereMicroservice)
     */
    @Override
    public TenantEngineConfigurationTemplate getTenantEngineConfigurationTemplate(SiteWhereTenant tenant,
	    SiteWhereMicroservice microservice) throws SiteWhereK8sException {
	TenantConfigurationTemplate tenantTemplate = getTenantConfigurationTemplates()
		.withName(tenant.getSpec().getConfigurationTemplate()).get();
	if (tenantTemplate == null) {
	    String message = String.format("Tenant references non-existent configuration template '%s'.",
		    tenant.getSpec().getConfigurationTemplate());
	    throw new SiteWhereK8sException(message);
	}
	String functionalArea = getFunctionalArea(microservice);
	String target = CaseFormat.LOWER_HYPHEN.to(CaseFormat.LOWER_CAMEL, functionalArea);
	String tecTemplateName = tenantTemplate.getSpec().getTenantEngineTemplates().get(target);
	if (tecTemplateName == null) {
	    return null;
	}

	return getTenantEngineConfigurationTemplates().withName(tecTemplateName).get();
    }

    /*
     * @see
     * io.sitewhere.k8s.crd.ISiteWhereKubernetesClient#getTenantEngine(io.sitewhere.
     * k8s.crd.microservice.SiteWhereMicroservice,
     * io.sitewhere.k8s.crd.tenant.SiteWhereTenant)
     */
    @Override
    public SiteWhereTenantEngine getTenantEngine(SiteWhereMicroservice microservice, SiteWhereTenant tenant)
	    throws SiteWhereK8sException {
	Map<String, String> labels = new HashMap<>();
	labels.put(ResourceLabels.LABEL_SITEWHERE_TENANT, tenant.getMetadata().getName());
	labels.put(ResourceLabels.LABEL_SITEWHERE_MICROSERVICE, microservice.getMetadata().getName());
	SiteWhereTenantEngineList list = getTenantEngines().inNamespace(microservice.getMetadata().getNamespace())
		.withLabels(labels).list();
	if (list.getItems().size() == 0) {
	    return null;
	} else if (list.getItems().size() == 1) {
	    return list.getItems().get(0);
	}
	throw new SiteWhereK8sException("Multiple tenant engines found for microservice/tenant combination.");
    }

    /*
     * @see
     * io.sitewhere.k8s.crd.ISiteWhereKubernetesClient#createNewTenantEngine(io.
     * sitewhere.k8s.crd.tenant.SiteWhereTenant,
     * io.sitewhere.k8s.crd.microservice.SiteWhereMicroservice)
     */
    @Override
    public void createNewTenantEngine(SiteWhereTenant tenant, SiteWhereMicroservice microservice)
	    throws SiteWhereK8sException {
	SiteWhereTenantEngine engine = new SiteWhereTenantEngine();
	String tenantEngineName = String.format("%s-%s-%s", tenant.getMetadata().getName(),
		microservice.getMetadata().getName(), String.valueOf(System.currentTimeMillis()));
	engine.getMetadata().setName(tenantEngineName);
	engine.getMetadata().setNamespace(tenant.getMetadata().getNamespace());

	Map<String, String> labels = new HashMap<>();
	String functionalArea = getFunctionalArea(microservice);
	labels.put(ResourceLabels.LABEL_SITEWHERE_TENANT, tenant.getMetadata().getName());
	labels.put(ResourceLabels.LABEL_SITEWHERE_MICROSERVICE, microservice.getMetadata().getName());
	labels.put(ResourceLabels.LABEL_SITEWHERE_FUNCTIONAL_AREA, functionalArea);
	engine.getMetadata().setLabels(labels);

	// Look up tenant configuration template for tenant/microservice combination.
	TenantEngineConfigurationTemplate tecTemplate = getTenantEngineConfigurationTemplate(tenant, microservice);
	if (tecTemplate == null) {
	    throw new SiteWhereK8sException(
		    String.format("Unable to resolve default tenant engine configuration for '%s'.", functionalArea));
	}

	// Copy template configuration into spec.
	SiteWhereTenantEngineSpec spec = new SiteWhereTenantEngineSpec();
	spec.setConfiguration(tecTemplate.getSpec().getConfiguration());
	engine.setSpec(spec);

	getTenantEngines().withName(tenantEngineName).createOrReplace(engine);
    }

    /*
     * @see
     * io.sitewhere.k8s.crd.ISiteWhereKubernetesClient#getActiveVersion(io.sitewhere
     * .k8s.crd.tenant.scripting.SiteWhereScript)
     */
    @Override
    public SiteWhereScriptVersion getActiveVersion(SiteWhereScript script) {
	String namespace = script.getMetadata().getNamespace();
	String activeVersion = script.getSpec().getActiveVersion();
	if (activeVersion != null) {
	    return getScriptsVersions().inNamespace(namespace).withName(activeVersion).get();
	} else {
	    return null;
	}
    }

    /*
     * @see
     * io.sitewhere.k8s.crd.ISiteWhereKubernetesClient#getParentScript(io.sitewhere.
     * k8s.crd.tenant.scripting.version.SiteWhereScriptVersion)
     */
    @Override
    public SiteWhereScript getParentScript(SiteWhereScriptVersion version) throws SiteWhereK8sException {
	String namespace = version.getMetadata().getNamespace();
	String scriptId = version.getMetadata().getLabels().get(ResourceLabels.LABEL_SCRIPTING_SCRIPT_ID);
	if (scriptId == null) {
	    throw new SiteWhereK8sException(
		    String.format("No script id associated with version: %s", version.getMetadata().getName()));
	}
	SiteWhereScriptList list = getScripts().inNamespace(namespace)
		.withLabel(ResourceLabels.LABEL_SCRIPTING_SCRIPT_ID, scriptId).list();
	if (list.getItems().size() > 1) {
	    throw new SiteWhereK8sException(String.format("Multiple scripts found with script id: %s", scriptId));
	} else if (list.getItems().size() == 0) {
	    throw new SiteWhereK8sException(String.format("No scripts found with script id: %s", scriptId));
	} else {
	    return list.getItems().get(0);
	}
    }

    protected KubernetesClient getClient() {
	return client;
    }
}
