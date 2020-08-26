/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.api;

import java.util.Map;

import io.fabric8.kubernetes.client.dsl.MixedOperation;
import io.fabric8.kubernetes.client.dsl.Resource;
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
 * API for interacting with SiteWhere resources via the fabric8 k8s client.
 */
public interface ISiteWhereKubernetesClient {

    /**
     * Gets context for operating on SiteWhere instances.
     * 
     * @return
     */
    MixedOperation<SiteWhereInstance, SiteWhereInstanceList, DoneableSiteWhereInstance, Resource<SiteWhereInstance, DoneableSiteWhereInstance>> getInstances();

    /**
     * Gets context for operating on SiteWhere microservices.
     * 
     * @return
     */
    MixedOperation<SiteWhereMicroservice, SiteWhereMicroserviceList, DoneableSiteWhereMicroservice, Resource<SiteWhereMicroservice, DoneableSiteWhereMicroservice>> getMicroservices();

    /**
     * Gets context for operating on SiteWhere instance configuration templates.
     * 
     * @return
     */
    MixedOperation<InstanceConfigurationTemplate, InstanceConfigurationTemplateList, DoneableInstanceConfigurationTemplate, Resource<InstanceConfigurationTemplate, DoneableInstanceConfigurationTemplate>> getInstanceConfigurationTemplates();

    /**
     * Gets context for operating on SiteWhere instance configuration templates.
     * 
     * @return
     */
    MixedOperation<InstanceDatasetTemplate, InstanceDatasetTemplateList, DoneableInstanceDatasetTemplate, Resource<InstanceDatasetTemplate, DoneableInstanceDatasetTemplate>> getInstanceDatasetTemplates();

    /**
     * Gets context for operating on SiteWhere tenants.
     * 
     * @return
     */
    MixedOperation<SiteWhereTenant, SiteWhereTenantList, DoneableSiteWhereTenant, Resource<SiteWhereTenant, DoneableSiteWhereTenant>> getTenants();

    /**
     * Gets context for operating on SiteWhere tenant configuration templates.
     * 
     * @return
     */
    MixedOperation<TenantConfigurationTemplate, TenantConfigurationTemplateList, DoneableTenantConfigurationTemplate, Resource<TenantConfigurationTemplate, DoneableTenantConfigurationTemplate>> getTenantConfigurationTemplates();

    /**
     * Gets context for operating on SiteWhere tenant dataset templates.
     * 
     * @return
     */
    MixedOperation<TenantDatasetTemplate, TenantDatasetTemplateList, DoneableTenantDatasetTemplate, Resource<TenantDatasetTemplate, DoneableTenantDatasetTemplate>> getTenantDatasetTemplates();

    /**
     * Gets context for operating on SiteWhere tenant engines.
     * 
     * @return
     */
    MixedOperation<SiteWhereTenantEngine, SiteWhereTenantEngineList, DoneableSiteWhereTenantEngine, Resource<SiteWhereTenantEngine, DoneableSiteWhereTenantEngine>> getTenantEngines();

    /**
     * Gets context for operating on SiteWhere tenant engine configuration
     * templates.
     * 
     * @return
     */
    MixedOperation<TenantEngineConfigurationTemplate, TenantEngineConfigurationTemplateList, DoneableTenantEngineConfigurationTemplate, Resource<TenantEngineConfigurationTemplate, DoneableTenantEngineConfigurationTemplate>> getTenantEngineConfigurationTemplates();

    /**
     * Gets context for operating on SiteWhere tenant engine dataset templates.
     * 
     * @return
     */
    MixedOperation<TenantEngineDatasetTemplate, TenantEngineDatasetTemplateList, DoneableTenantEngineDatasetTemplate, Resource<TenantEngineDatasetTemplate, DoneableTenantEngineDatasetTemplate>> getTenantEngineDatasetTemplates();

    /**
     * Gets context for operating on SiteWhere script categories.
     * 
     * @return
     */
    MixedOperation<SiteWhereScriptCategory, SiteWhereScriptCategoryList, DoneableSiteWhereScriptCategory, Resource<SiteWhereScriptCategory, DoneableSiteWhereScriptCategory>> getScriptCategories();

    /**
     * Gets context for operating on SiteWhere script templates.
     * 
     * @return
     */
    MixedOperation<SiteWhereScriptTemplate, SiteWhereScriptTemplateList, DoneableSiteWhereScriptTemplate, Resource<SiteWhereScriptTemplate, DoneableSiteWhereScriptTemplate>> getScriptTemplates();

    /**
     * Gets context for operating on SiteWhere scripts.
     * 
     * @return
     */
    MixedOperation<SiteWhereScript, SiteWhereScriptList, DoneableSiteWhereScript, Resource<SiteWhereScript, DoneableSiteWhereScript>> getScripts();

    /**
     * Gets context for operating on SiteWhere script versions.
     * 
     * @return
     */
    MixedOperation<SiteWhereScriptVersion, SiteWhereScriptVersionList, DoneableSiteWhereScriptVersion, Resource<SiteWhereScriptVersion, DoneableSiteWhereScriptVersion>> getScriptsVersions();

    /**
     * Get functional area for a microservice.
     * 
     * @param microservice
     * @return
     */
    String getFunctionalArea(SiteWhereMicroservice microservice);

    /**
     * Get all microservices in the given namespace.
     * 
     * @param namespace
     * @return
     */
    SiteWhereMicroserviceList getAllMicroservices(String namespace);

    /**
     * Get microservice corresponding to identifier. Returns null if none is found.
     * 
     * @param namespace
     * @param identifier
     * @return
     */
    SiteWhereMicroservice getMicroserviceForIdentifier(String namespace, String identifier);

    /**
     * Get all tenants in the given namespace.
     * 
     * @param namespace
     * @return
     */
    SiteWhereTenantList getAllTenants(String namespace);

    /**
     * Get tenant corresponding to token. Returns null if none is found.
     * 
     * @param namespace
     * @param token
     * @return
     */
    SiteWhereTenant getTenantForToken(String namespace, String token);

    /**
     * Get map of tenant engines for a tenant (indexed by microservice name).
     * 
     * @param tenant
     * @return
     */
    Map<String, SiteWhereTenantEngine> getTenantEnginesForTenantByMicroservice(SiteWhereTenant tenant);

    /**
     * Get map of tenant engines for a microservice (indexed by tenant id).
     * 
     * @param microservice
     * @return
     */
    Map<String, SiteWhereTenantEngine> getTenantEnginesForMicroserviceByTenant(SiteWhereMicroservice microservice);

    /**
     * Locate tenant engine configuration template based on tenant configuration
     * template associated with tenant.
     * 
     * @param tenant
     * @param microservice
     * @return
     * @throws SiteWhereK8sException
     */
    TenantEngineConfigurationTemplate getTenantEngineConfigurationTemplate(SiteWhereTenant tenant,
	    SiteWhereMicroservice microservice) throws SiteWhereK8sException;

    /**
     * Get a tenant engine that corresponds to the given microservice and tenant.
     * 
     * @param microservice
     * @param tenant
     * @return
     * @throws SiteWhereK8sException
     */
    SiteWhereTenantEngine getTenantEngine(SiteWhereMicroservice microservice, SiteWhereTenant tenant)
	    throws SiteWhereK8sException;

    /**
     * Create a new tenant engine for a tenant/microservice combination.
     * 
     * @param tenant
     * @param microservice
     * @throws SiteWhereK8sException
     */
    void createNewTenantEngine(SiteWhereTenant tenant, SiteWhereMicroservice microservice) throws SiteWhereK8sException;

    /**
     * Get the active version of a given script.
     * 
     * @param script
     * @return
     */
    SiteWhereScriptVersion getActiveVersion(SiteWhereScript script);

    /**
     * Get parent script for version.
     * 
     * @param version
     * @return
     * @throws SiteWhereK8sException
     */
    SiteWhereScript getParentScript(SiteWhereScriptVersion version) throws SiteWhereK8sException;
}
