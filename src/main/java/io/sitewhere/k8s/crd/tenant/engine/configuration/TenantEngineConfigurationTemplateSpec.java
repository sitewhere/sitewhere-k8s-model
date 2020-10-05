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
package io.sitewhere.k8s.crd.tenant.engine.configuration;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.fabric8.kubernetes.api.model.KubernetesResource;

/**
 * TenantEngineConfigurationTemplate CRD specification.
 */
@JsonDeserialize(using = JsonDeserializer.None.class)
public class TenantEngineConfigurationTemplateSpec implements KubernetesResource {

    /** Serial version UID */
    private static final long serialVersionUID = -669286121084379993L;

    /** Configuration content */
    private JsonNode configuration;

    public JsonNode getConfiguration() {
	return configuration;
    }

    public void setConfiguration(JsonNode configuration) {
	this.configuration = configuration;
    }
}
