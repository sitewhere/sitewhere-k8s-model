/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd;

import io.fabric8.kubernetes.client.dsl.MixedOperation;
import io.fabric8.kubernetes.client.dsl.Resource;
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
}
