/**
 * Copyright © 2014-2021 The SiteWhere Authors
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
package io.sitewhere.k8s.crd.tenant;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
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
    @JsonInclude(Include.NON_NULL)
    private String name;

    /** Authenticaton token */
    @JsonInclude(Include.NON_NULL)
    private String authenticationToken;

    /** Authorized user ids */
    @JsonInclude(Include.NON_NULL)
    private String[] authorizedUserIds;

    /** Configuration template */
    @JsonInclude(Include.NON_NULL)
    private String configurationTemplate;

    /** Dataset template */
    @JsonInclude(Include.NON_NULL)
    private String datasetTemplate;

    /** Branding information */
    @JsonInclude(Include.NON_NULL)
    private TenantBrandingSpecification branding;

    /** Metadata */
    @JsonInclude(Include.NON_NULL)
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
