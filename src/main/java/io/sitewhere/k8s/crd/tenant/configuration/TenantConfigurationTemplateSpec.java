/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.tenant.configuration;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.fabric8.kubernetes.api.model.KubernetesResource;

/**
 * TenantConfigurationTemplate CRD specification.
 */
@JsonDeserialize(using = JsonDeserializer.None.class)
public class TenantConfigurationTemplateSpec implements KubernetesResource {

    /** Serial version UID */
    private static final long serialVersionUID = 3970238152768201386L;

    /** Display name */
    private String name;

    /** Description */
    private String description;

    /** Map of functional areas to template names */
    private Map<String, String> tenantEngineTemplates = new HashMap<>();

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public Map<String, String> getTenantEngineTemplates() {
	return tenantEngineTemplates;
    }

    public void setTenantEngineTemplates(Map<String, String> tenantEngineTemplates) {
	this.tenantEngineTemplates = tenantEngineTemplates;
    }
}
