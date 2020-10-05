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

    /** Context used for accessing instance configuration templates */
    public static final CustomResourceDefinitionContext INSTANCE_CONFIG_TEMPLATE_CONTEXT = new CustomResourceDefinitionContext.Builder()
	    .withVersion(ApiConstants.SITEWHERE_API_VERSION).withGroup(ApiConstants.SITEWHERE_TEMPLATES_API_GROUP)
	    .withPlural(ApiConstants.SITEWHERE_ICT_CRD_PLURAL).withScope(SCOPE_CLUSTER).build();

    /** Context used for accessing instance dataset templates */
    public static final CustomResourceDefinitionContext INSTANCE_DATASET_TEMPLATE_CONTEXT = new CustomResourceDefinitionContext.Builder()
	    .withVersion(ApiConstants.SITEWHERE_API_VERSION).withGroup(ApiConstants.SITEWHERE_TEMPLATES_API_GROUP)
	    .withPlural(ApiConstants.SITEWHERE_IDT_CRD_PLURAL).withScope(SCOPE_CLUSTER).build();

    /** Context used for accessing microservices */
    public static final CustomResourceDefinitionContext MICROSERVICE_CONTEXT = new CustomResourceDefinitionContext.Builder()
	    .withVersion(ApiConstants.SITEWHERE_API_VERSION).withGroup(ApiConstants.SITEWHERE_API_GROUP)
	    .withPlural(ApiConstants.SITEWHERE_MICROSERVICE_CRD_PLURAL).withScope(SCOPE_NAMESPACED).build();

    /** Context used for accessing tenants */
    public static final CustomResourceDefinitionContext TENANT_CONTEXT = new CustomResourceDefinitionContext.Builder()
	    .withVersion(ApiConstants.SITEWHERE_API_VERSION).withGroup(ApiConstants.SITEWHERE_API_GROUP)
	    .withPlural(ApiConstants.SITEWHERE_TENANT_CRD_PLURAL).withScope(SCOPE_NAMESPACED).build();

    /** Context used for accessing tenant configuration templates */
    public static final CustomResourceDefinitionContext TENANT_CONFIG_TEMPLATE_CONTEXT = new CustomResourceDefinitionContext.Builder()
	    .withVersion(ApiConstants.SITEWHERE_API_VERSION).withGroup(ApiConstants.SITEWHERE_TEMPLATES_API_GROUP)
	    .withPlural(ApiConstants.SITEWHERE_TCT_CRD_PLURAL).withScope(SCOPE_CLUSTER).build();

    /** Context used for accessing tenant dataset templates */
    public static final CustomResourceDefinitionContext TENANT_DATASET_TEMPLATE_CONTEXT = new CustomResourceDefinitionContext.Builder()
	    .withVersion(ApiConstants.SITEWHERE_API_VERSION).withGroup(ApiConstants.SITEWHERE_TEMPLATES_API_GROUP)
	    .withPlural(ApiConstants.SITEWHERE_TDT_CRD_PLURAL).withScope(SCOPE_CLUSTER).build();

    /** Context used for accessing tenant engines */
    public static final CustomResourceDefinitionContext TENANT_ENGINE_CONTEXT = new CustomResourceDefinitionContext.Builder()
	    .withVersion(ApiConstants.SITEWHERE_API_VERSION).withGroup(ApiConstants.SITEWHERE_API_GROUP)
	    .withPlural(ApiConstants.SITEWHERE_TENANT_ENGINE_CRD_PLURAL).withScope(SCOPE_NAMESPACED).build();

    /** Context used for accessing tenant engine configuration templates */
    public static final CustomResourceDefinitionContext TENANT_ENGINE_CONFIG_TEMPLATE_CONTEXT = new CustomResourceDefinitionContext.Builder()
	    .withVersion(ApiConstants.SITEWHERE_API_VERSION).withGroup(ApiConstants.SITEWHERE_TEMPLATES_API_GROUP)
	    .withPlural(ApiConstants.SITEWHERE_TECT_CRD_PLURAL).withScope(SCOPE_CLUSTER).build();

    /** Context used for accessing tenant engine dataset templates */
    public static final CustomResourceDefinitionContext TENANT_ENGINE_DATASET_TEMPLATE_CONTEXT = new CustomResourceDefinitionContext.Builder()
	    .withVersion(ApiConstants.SITEWHERE_API_VERSION).withGroup(ApiConstants.SITEWHERE_TEMPLATES_API_GROUP)
	    .withPlural(ApiConstants.SITEWHERE_TEDT_CRD_PLURAL).withScope(SCOPE_CLUSTER).build();

    /** Context used for accessing script categories */
    public static final CustomResourceDefinitionContext SCRIPT_CATEGORY_CONTEXT = new CustomResourceDefinitionContext.Builder()
	    .withVersion(ApiConstants.SITEWHERE_API_VERSION).withGroup(ApiConstants.SITEWHERE_SCRIPTING_API_GROUP)
	    .withPlural(ApiConstants.SITEWHERE_SCRIPT_CATEGORY_CRD_PLURAL).withScope(SCOPE_CLUSTER).build();

    /** Context used for accessing script templates */
    public static final CustomResourceDefinitionContext SCRIPT_TEMPLATE_CONTEXT = new CustomResourceDefinitionContext.Builder()
	    .withVersion(ApiConstants.SITEWHERE_API_VERSION).withGroup(ApiConstants.SITEWHERE_SCRIPTING_API_GROUP)
	    .withPlural(ApiConstants.SITEWHERE_SCRIPT_TEMPLATE_CRD_PLURAL).withScope(SCOPE_CLUSTER).build();

    /** Context used for accessing scripts */
    public static final CustomResourceDefinitionContext SCRIPT_CONTEXT = new CustomResourceDefinitionContext.Builder()
	    .withVersion(ApiConstants.SITEWHERE_API_VERSION).withGroup(ApiConstants.SITEWHERE_SCRIPTING_API_GROUP)
	    .withPlural(ApiConstants.SITEWHERE_SCRIPT_CRD_PLURAL).withScope(SCOPE_NAMESPACED).build();

    /** Context used for accessing script versions */
    public static final CustomResourceDefinitionContext SCRIPT_VERSION_CONTEXT = new CustomResourceDefinitionContext.Builder()
	    .withVersion(ApiConstants.SITEWHERE_API_VERSION).withGroup(ApiConstants.SITEWHERE_SCRIPTING_API_GROUP)
	    .withPlural(ApiConstants.SITEWHERE_SCRIPT_VERSION_CRD_PLURAL).withScope(SCOPE_NAMESPACED).build();
}
