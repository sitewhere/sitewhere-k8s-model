/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd;

public class ApiConstants {

    /** SiteWhere application name */
    public static final String SITEWHERE_APP_NAME = "sitewhere";

    /** SiteWhere CRD API version */
    public static final String SITEWHERE_API_VERSION = "v1alpha3";

    /** SiteWhere API group */
    public static final String SITEWHERE_API_GROUP = "sitewhere.io";

    /** SiteWhere templates API group */
    public static final String SITEWHERE_TEMPLATES_API_GROUP = "templates.sitewhere.io";

    /** SiteWhere scripting API group */
    public static final String SITEWHERE_SCRIPTING_API_GROUP = "scripting.sitewhere.io";

    /** SiteWhereInstance CRD plural */
    public static final String SITEWHERE_INSTANCE_CRD_PLURAL = "instances";

    /** InstanceConfigurationTemplate CRD plural */
    public static final String SITEWHERE_ICT_CRD_PLURAL = "instanceconfigurations";

    /** InstanceDatasetTemplate CRD plural */
    public static final String SITEWHERE_IDT_CRD_PLURAL = "instancedatasets";

    /** SiteWhereMicroservice CRD plural */
    public static final String SITEWHERE_MICROSERVICE_CRD_PLURAL = "microservices";

    /** SiteWhereTenant CRD plural */
    public static final String SITEWHERE_TENANT_CRD_PLURAL = "tenants";

    /** TenantConfigurationTemplate CRD plural */
    public static final String SITEWHERE_TCT_CRD_PLURAL = "tenantconfigurations";

    /** TenantDatasetTemplate CRD plural */
    public static final String SITEWHERE_TDT_CRD_PLURAL = "tenantdatasets";

    /** SiteWhereTenantEngine CRD plural */
    public static final String SITEWHERE_TENANT_ENGINE_CRD_PLURAL = "tenantengines";

    /** TenantEngineConfigurationTemplate CRD plural */
    public static final String SITEWHERE_TECT_CRD_PLURAL = "tenantengineconfigurations";

    /** TenantEngineDatasetTemplate CRD plural */
    public static final String SITEWHERE_TEDT_CRD_PLURAL = "tenantenginedatasets";

    /** SiteWhereScriptCategory CRD plural */
    public static final String SITEWHERE_SCRIPT_CATEGORY_CRD_PLURAL = "scriptcategories";

    /** SiteWhereScriptTemplate CRD plural */
    public static final String SITEWHERE_SCRIPT_TEMPLATE_CRD_PLURAL = "scripttemplates";

    /** SiteWhereScript CRD plural */
    public static final String SITEWHERE_SCRIPT_CRD_PLURAL = "scripts";

    /** SiteWhereScriptVersion CRD plural */
    public static final String SITEWHERE_SCRIPT_VERSION_CRD_PLURAL = "scriptversions";

    /** SiteWhereInstance CRD name */
    public static final String SITEWHERE_INSTANCE_CRD_NAME = SITEWHERE_INSTANCE_CRD_PLURAL + "." + SITEWHERE_API_GROUP;

    /** InstanceConfigurationTemplate CRD name */
    public static final String SITEWHERE_ICT_CRD_NAME = SITEWHERE_ICT_CRD_PLURAL + "." + SITEWHERE_TEMPLATES_API_GROUP;

    /** InstanceDatasetTemplate CRD name */
    public static final String SITEWHERE_IDT_CRD_NAME = SITEWHERE_IDT_CRD_PLURAL + "." + SITEWHERE_TEMPLATES_API_GROUP;

    /** SiteWhereMicroservice CRD name */
    public static final String SITEWHERE_MICROSERVICE_CRD_NAME = SITEWHERE_MICROSERVICE_CRD_PLURAL + "."
	    + SITEWHERE_API_GROUP;

    /** SiteWhereTenant CRD name */
    public static final String SITEWHERE_TENANT_CRD_NAME = SITEWHERE_TENANT_CRD_PLURAL + "." + SITEWHERE_API_GROUP;

    /** TenantConfigurationTemplate CRD name */
    public static final String SITEWHERE_TCT_CRD_NAME = SITEWHERE_TCT_CRD_PLURAL + "." + SITEWHERE_TEMPLATES_API_GROUP;

    /** TenantDatasetTemplate CRD name */
    public static final String SITEWHERE_TDT_CRD_NAME = SITEWHERE_TDT_CRD_PLURAL + "." + SITEWHERE_TEMPLATES_API_GROUP;

    /** SiteWhereTenantEngine CRD name */
    public static final String SITEWHERE_TENANT_ENGINE_CRD_NAME = SITEWHERE_TENANT_ENGINE_CRD_PLURAL + "."
	    + SITEWHERE_API_GROUP;

    /** TenantEngineConfigurationTemplate CRD name */
    public static final String SITEWHERE_TECT_CRD_NAME = SITEWHERE_TECT_CRD_PLURAL + "."
	    + SITEWHERE_TEMPLATES_API_GROUP;

    /** TenantEngineDatasetTemplate CRD name */
    public static final String SITEWHERE_TEDT_CRD_NAME = SITEWHERE_TEDT_CRD_PLURAL + "."
	    + SITEWHERE_TEMPLATES_API_GROUP;

    /** SiteWhereScriptCategory CRD name */
    public static final String SITEWHERE_SCRIPT_CATEGORY_CRD_NAME = SITEWHERE_SCRIPT_CATEGORY_CRD_PLURAL + "."
	    + SITEWHERE_SCRIPTING_API_GROUP;

    /** SiteWhereScriptTemplate CRD name */
    public static final String SITEWHERE_SCRIPT_TEMPLATE_CRD_NAME = SITEWHERE_SCRIPT_TEMPLATE_CRD_PLURAL + "."
	    + SITEWHERE_SCRIPTING_API_GROUP;

    /** SiteWhereScript CRD name */
    public static final String SITEWHERE_SCRIPT_CRD_NAME = SITEWHERE_SCRIPT_CRD_PLURAL + "."
	    + SITEWHERE_SCRIPTING_API_GROUP;

    /** SiteWhereScriptVersion CRD name */
    public static final String SITEWHERE_SCRIPT_VERSION_CRD_NAME = SITEWHERE_SCRIPT_VERSION_CRD_PLURAL + "."
	    + SITEWHERE_SCRIPTING_API_GROUP;
}
