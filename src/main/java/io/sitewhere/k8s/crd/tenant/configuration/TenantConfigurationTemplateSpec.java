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
