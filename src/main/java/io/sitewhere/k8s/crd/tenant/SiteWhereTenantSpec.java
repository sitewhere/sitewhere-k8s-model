/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.tenant;

import java.util.Map;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.fabric8.kubernetes.api.model.KubernetesResource;

/**
 * SiteWhereTenant CRD specification.
 */
@JsonDeserialize(using = JsonDeserializer.None.class)
public class SiteWhereTenantSpec implements KubernetesResource {

    /** Serial version UID */
    private static final long serialVersionUID = 8782678554803455928L;

    /** Tenant name */
    private String name;

    /** Authenticaton token */
    private String authenticationToken;

    /** Authorized user ids */
    private String[] authorizedUserIds;

    /** Configuration template */
    private String configurationTemplate;

    /** Dataset template */
    private String datasetTemplate;

    /** Branding information */
    private TenantBrandingSpecification branding;

    /** Metadata */
    private Map<String, String> metadata;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getAuthenticationToken() {
	return authenticationToken;
    }

    public void setAuthenticationToken(String authenticationToken) {
	this.authenticationToken = authenticationToken;
    }

    public String[] getAuthorizedUserIds() {
	return authorizedUserIds;
    }

    public void setAuthorizedUserIds(String[] authorizedUserIds) {
	this.authorizedUserIds = authorizedUserIds;
    }

    public String getConfigurationTemplate() {
	return configurationTemplate;
    }

    public void setConfigurationTemplate(String configurationTemplate) {
	this.configurationTemplate = configurationTemplate;
    }

    public String getDatasetTemplate() {
	return datasetTemplate;
    }

    public void setDatasetTemplate(String datasetTemplate) {
	this.datasetTemplate = datasetTemplate;
    }

    public TenantBrandingSpecification getBranding() {
	return branding;
    }

    public void setBranding(TenantBrandingSpecification branding) {
	this.branding = branding;
    }

    public Map<String, String> getMetadata() {
	return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
	this.metadata = metadata;
    }
}
