/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd;

import io.fabric8.kubernetes.client.dsl.base.CustomResourceDefinitionContext;

public class ResourceContexts {

    /** Namespace scoped resource */
    public static final String SCOPE_NAMESPACED = "Namespaced";

    /** Cluster scoped resource */
    public static final String SCOPE_CLUSTER = "Cluster";

    /** Context used for accessing instances */
    public static final CustomResourceDefinitionContext INSTANCE_CONTEXT = new CustomResourceDefinitionContext.Builder()
	    .withVersion(ApiConstants.SITEWHERE_API_VERSION).withGroup(ApiConstants.SITEWHERE_API_GROUP)
	    .withPlural(ApiConstants.SITEWHERE_INSTANCE_CRD_PLURAL).withScope(SCOPE_CLUSTER).build();

    /** Context used for accessing microservices */
    public static final CustomResourceDefinitionContext MICROSERVICE_CONTEXT = new CustomResourceDefinitionContext.Builder()
	    .withVersion(ApiConstants.SITEWHERE_API_VERSION).withGroup(ApiConstants.SITEWHERE_API_GROUP)
	    .withPlural(ApiConstants.SITEWHERE_MICROSERVICE_CRD_PLURAL).withScope(SCOPE_NAMESPACED).build();

    /** Context used for accessing tenants */
    public static final CustomResourceDefinitionContext TENANT_CONTEXT = new CustomResourceDefinitionContext.Builder()
	    .withVersion(ApiConstants.SITEWHERE_API_VERSION).withGroup(ApiConstants.SITEWHERE_API_GROUP)
	    .withPlural(ApiConstants.SITEWHERE_TENANT_CRD_PLURAL).withScope(SCOPE_NAMESPACED).build();

    /** Context used for accessing tenant engines */
    public static final CustomResourceDefinitionContext TENANT_ENGINE_CONTEXT = new CustomResourceDefinitionContext.Builder()
	    .withVersion(ApiConstants.SITEWHERE_API_VERSION).withGroup(ApiConstants.SITEWHERE_API_GROUP)
	    .withPlural(ApiConstants.SITEWHERE_TENANT_ENGINE_CRD_PLURAL).withScope(SCOPE_NAMESPACED).build();

    /** Context used for accessing scripts */
    public static final CustomResourceDefinitionContext SCRIPT_CONTEXT = new CustomResourceDefinitionContext.Builder()
	    .withVersion(ApiConstants.SITEWHERE_API_VERSION).withGroup(ApiConstants.SITEWHERE_SCRIPTING_API_GROUP)
	    .withPlural(ApiConstants.SITEWHERE_SCRIPT_CRD_PLURAL).withScope(SCOPE_NAMESPACED).build();

    /** Context used for accessing script versions */
    public static final CustomResourceDefinitionContext SCRIPT_VERSION_CONTEXT = new CustomResourceDefinitionContext.Builder()
	    .withVersion(ApiConstants.SITEWHERE_API_VERSION).withGroup(ApiConstants.SITEWHERE_SCRIPTING_API_GROUP)
	    .withPlural(ApiConstants.SITEWHERE_SCRIPT_VERSION_CRD_PLURAL).withScope(SCOPE_NAMESPACED).build();

    /** Context used for accessing infra catalogs */
    public static final CustomResourceDefinitionContext INFRA_CATALOG_CONTEXT = new CustomResourceDefinitionContext.Builder()
	    .withVersion(ApiConstants.SITEWHERE_API_VERSION).withGroup(ApiConstants.SITEWHERE_INFRA_API_GROUP)
	    .withPlural(ApiConstants.SITEWHERE_INFRA_CATALOG_CRD_PLURAL).withScope(SCOPE_CLUSTER).build();

    /** Context used for accessing infra catalog item groups */
    public static final CustomResourceDefinitionContext INFRA_CATALOG_ITEM_GROUP_CONTEXT = new CustomResourceDefinitionContext.Builder()
	    .withVersion(ApiConstants.SITEWHERE_API_VERSION).withGroup(ApiConstants.SITEWHERE_INFRA_API_GROUP)
	    .withPlural(ApiConstants.SITEWHERE_INFRA_CATALOG_ITEM_GROUP_CRD_PLURAL).withScope(SCOPE_CLUSTER).build();

    /** Context used for accessing infra catalog items */
    public static final CustomResourceDefinitionContext INFRA_CATALOG_ITEM_CONTEXT = new CustomResourceDefinitionContext.Builder()
	    .withVersion(ApiConstants.SITEWHERE_API_VERSION).withGroup(ApiConstants.SITEWHERE_INFRA_API_GROUP)
	    .withPlural(ApiConstants.SITEWHERE_INFRA_CATALOG_ITEM_CRD_PLURAL).withScope(SCOPE_CLUSTER).build();

    /** Context used for accessing infra configurations */
    public static final CustomResourceDefinitionContext INFRA_CONFIGURATION_CONTEXT = new CustomResourceDefinitionContext.Builder()
	    .withVersion(ApiConstants.SITEWHERE_API_VERSION).withGroup(ApiConstants.SITEWHERE_INFRA_API_GROUP)
	    .withPlural(ApiConstants.SITEWHERE_INFRA_CONFIGURATION_CRD_PLURAL).withScope(SCOPE_CLUSTER).build();

    /** Context used for accessing infra components */
    public static final CustomResourceDefinitionContext INFRA_COMPONENT_CONTEXT = new CustomResourceDefinitionContext.Builder()
	    .withVersion(ApiConstants.SITEWHERE_API_VERSION).withGroup(ApiConstants.SITEWHERE_INFRA_API_GROUP)
	    .withPlural(ApiConstants.SITEWHERE_INFRA_COMPONENT_CRD_PLURAL).withScope(SCOPE_CLUSTER).build();
}
