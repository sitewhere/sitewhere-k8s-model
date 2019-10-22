/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd;

import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinition;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.dsl.MixedOperation;
import io.fabric8.kubernetes.client.dsl.Resource;
import io.sitewhere.k8s.crd.instance.DoneableSiteWhereInstance;
import io.sitewhere.k8s.crd.instance.SiteWhereInstance;
import io.sitewhere.k8s.crd.instance.SiteWhereInstanceList;
import io.sitewhere.k8s.crd.instance.configuration.DoneableInstanceConfigurationTemplate;
import io.sitewhere.k8s.crd.instance.configuration.InstanceConfigurationTemplate;
import io.sitewhere.k8s.crd.instance.configuration.InstanceConfigurationTemplateList;
import io.sitewhere.k8s.crd.microservice.DoneableSiteWhereMicroservice;
import io.sitewhere.k8s.crd.microservice.SiteWhereMicroservice;
import io.sitewhere.k8s.crd.microservice.SiteWhereMicroserviceList;
import io.sitewhere.k8s.crd.tenant.DoneableSiteWhereTenant;
import io.sitewhere.k8s.crd.tenant.SiteWhereTenant;
import io.sitewhere.k8s.crd.tenant.SiteWhereTenantList;
import io.sitewhere.k8s.crd.tenant.configuration.DoneableTenantConfigurationTemplate;
import io.sitewhere.k8s.crd.tenant.configuration.TenantConfigurationTemplate;
import io.sitewhere.k8s.crd.tenant.configuration.TenantConfigurationTemplateList;
import io.sitewhere.k8s.crd.tenant.engine.DoneableSiteWhereTenantEngine;
import io.sitewhere.k8s.crd.tenant.engine.SiteWhereTenantEngine;
import io.sitewhere.k8s.crd.tenant.engine.SiteWhereTenantEngineList;
import io.sitewhere.k8s.crd.tenant.engine.configuration.DoneableTenantEngineConfigurationTemplate;
import io.sitewhere.k8s.crd.tenant.engine.configuration.TenantEngineConfigurationTemplate;
import io.sitewhere.k8s.crd.tenant.engine.configuration.TenantEngineConfigurationTemplateList;
import io.sitewhere.k8s.crd.tenant.engine.dataset.DoneableTenantEngineDatasetTemplate;
import io.sitewhere.k8s.crd.tenant.engine.dataset.TenantEngineDatasetTemplate;
import io.sitewhere.k8s.crd.tenant.engine.dataset.TenantEngineDatasetTemplateList;

/**
 * Adds interactions with SiteWhere-specific resource to fabric8 k8s Java
 * client.
 */
public class SiteWhereKubernetesClient implements ISiteWhereKubernetesClient {

    /** Wrapped client */
    private KubernetesClient client;

    public SiteWhereKubernetesClient(KubernetesClient client) {
	this.client = client;
    }

    /*
     * @see io.sitewhere.k8s.crd.ISiteWhereKubernetesClient#getInstances()
     */
    public MixedOperation<SiteWhereInstance, SiteWhereInstanceList, DoneableSiteWhereInstance, Resource<SiteWhereInstance, DoneableSiteWhereInstance>> getInstances() {
	CustomResourceDefinition crd = getClient().customResourceDefinitions()
		.withName(ApiConstants.SITEWHERE_INSTANCE_CRD_NAME).get();
	if (crd == null) {
	    throw new RuntimeException(
		    String.format("CRD missing for '%s'", ApiConstants.SITEWHERE_MICROSERVICE_CRD_NAME));
	}
	return getClient().customResources(crd, SiteWhereInstance.class, SiteWhereInstanceList.class,
		DoneableSiteWhereInstance.class);
    }

    /*
     * @see io.sitewhere.k8s.crd.ISiteWhereKubernetesClient#getMicroservices()
     */
    public MixedOperation<SiteWhereMicroservice, SiteWhereMicroserviceList, DoneableSiteWhereMicroservice, Resource<SiteWhereMicroservice, DoneableSiteWhereMicroservice>> getMicroservices() {
	CustomResourceDefinition crd = getClient().customResourceDefinitions()
		.withName(ApiConstants.SITEWHERE_MICROSERVICE_CRD_NAME).get();
	if (crd == null) {
	    throw new RuntimeException(
		    String.format("CRD missing for '%s'", ApiConstants.SITEWHERE_MICROSERVICE_CRD_NAME));
	}
	return getClient().customResources(crd, SiteWhereMicroservice.class, SiteWhereMicroserviceList.class,
		DoneableSiteWhereMicroservice.class);
    }

    /*
     * @see io.sitewhere.k8s.crd.ISiteWhereKubernetesClient#
     * getInstanceConfigurationTemplates()
     */
    public MixedOperation<InstanceConfigurationTemplate, InstanceConfigurationTemplateList, DoneableInstanceConfigurationTemplate, Resource<InstanceConfigurationTemplate, DoneableInstanceConfigurationTemplate>> getInstanceConfigurationTemplates() {
	CustomResourceDefinition crd = getClient().customResourceDefinitions()
		.withName(ApiConstants.SITEWHERE_ICT_CRD_NAME).get();
	if (crd == null) {
	    throw new RuntimeException(String.format("CRD missing for '%s'", ApiConstants.SITEWHERE_ICT_CRD_NAME));
	}
	return getClient().customResources(crd, InstanceConfigurationTemplate.class,
		InstanceConfigurationTemplateList.class, DoneableInstanceConfigurationTemplate.class);
    }

    /*
     * @see io.sitewhere.k8s.crd.ISiteWhereKubernetesClient#getTenants()
     */
    public MixedOperation<SiteWhereTenant, SiteWhereTenantList, DoneableSiteWhereTenant, Resource<SiteWhereTenant, DoneableSiteWhereTenant>> getTenants() {
	CustomResourceDefinition crd = getClient().customResourceDefinitions()
		.withName(ApiConstants.SITEWHERE_TENANT_CRD_NAME).get();
	if (crd == null) {
	    throw new RuntimeException(String.format("CRD missing for '%s'", ApiConstants.SITEWHERE_TENANT_CRD_NAME));
	}
	return getClient().customResources(crd, SiteWhereTenant.class, SiteWhereTenantList.class,
		DoneableSiteWhereTenant.class);
    }

    /*
     * @see io.sitewhere.k8s.crd.ISiteWhereKubernetesClient#
     * getTenantConfigurationTemplates()
     */
    public MixedOperation<TenantConfigurationTemplate, TenantConfigurationTemplateList, DoneableTenantConfigurationTemplate, Resource<TenantConfigurationTemplate, DoneableTenantConfigurationTemplate>> getTenantConfigurationTemplates() {
	CustomResourceDefinition crd = getClient().customResourceDefinitions()
		.withName(ApiConstants.SITEWHERE_TCT_CRD_NAME).get();
	if (crd == null) {
	    throw new RuntimeException(String.format("CRD missing for '%s'", ApiConstants.SITEWHERE_TCT_CRD_NAME));
	}
	return getClient().customResources(crd, TenantConfigurationTemplate.class,
		TenantConfigurationTemplateList.class, DoneableTenantConfigurationTemplate.class);
    }

    /*
     * @see io.sitewhere.k8s.crd.ISiteWhereKubernetesClient#getTenantEngines()
     */
    public MixedOperation<SiteWhereTenantEngine, SiteWhereTenantEngineList, DoneableSiteWhereTenantEngine, Resource<SiteWhereTenantEngine, DoneableSiteWhereTenantEngine>> getTenantEngines() {
	CustomResourceDefinition crd = getClient().customResourceDefinitions()
		.withName(ApiConstants.SITEWHERE_TENANT_ENGINE_CRD_NAME).get();
	if (crd == null) {
	    throw new RuntimeException(
		    String.format("CRD missing for '%s'", ApiConstants.SITEWHERE_TENANT_ENGINE_CRD_NAME));
	}
	return getClient().customResources(crd, SiteWhereTenantEngine.class, SiteWhereTenantEngineList.class,
		DoneableSiteWhereTenantEngine.class);
    }

    /*
     * @see io.sitewhere.k8s.crd.ISiteWhereKubernetesClient#
     * getTenantEngineConfigurationTemplates()
     */
    public MixedOperation<TenantEngineConfigurationTemplate, TenantEngineConfigurationTemplateList, DoneableTenantEngineConfigurationTemplate, Resource<TenantEngineConfigurationTemplate, DoneableTenantEngineConfigurationTemplate>> getTenantEngineConfigurationTemplates() {
	CustomResourceDefinition crd = getClient().customResourceDefinitions()
		.withName(ApiConstants.SITEWHERE_TECT_CRD_NAME).get();
	if (crd == null) {
	    throw new RuntimeException(String.format("CRD missing for '%s'", ApiConstants.SITEWHERE_TECT_CRD_NAME));
	}
	return getClient().customResources(crd, TenantEngineConfigurationTemplate.class,
		TenantEngineConfigurationTemplateList.class, DoneableTenantEngineConfigurationTemplate.class);
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
	CustomResourceDefinition crd = getClient().customResourceDefinitions()
		.withName(ApiConstants.SITEWHERE_TEDT_CRD_NAME).get();
	if (crd == null) {
	    throw new RuntimeException(String.format("CRD missing for '%s'", ApiConstants.SITEWHERE_TEDT_CRD_NAME));
	}
	return getClient().customResources(crd, TenantEngineDatasetTemplate.class,
		TenantEngineDatasetTemplateList.class, DoneableTenantEngineDatasetTemplate.class);
    }

    protected KubernetesClient getClient() {
	return client;
    }
}
