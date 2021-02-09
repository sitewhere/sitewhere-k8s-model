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
package io.sitewhere.k8s.crd.tenant.scripting;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.fabric8.kubernetes.api.model.KubernetesResource;

/**
 * SiteWhereScript CRD specification.
 */
@JsonDeserialize(using = JsonDeserializer.None.class)
public class SiteWhereScriptSpec implements KubernetesResource {

    /** Serial version UID */
    private static final long serialVersionUID = 4418530241331241674L;

    /** Script id */
    private String scriptId;

    /** Name */
    private String name;

    /** Description */
    private String description;

    /** Interpreter type */
    private String interpreterType;

    /** Active version id */
    private String activeVersion;

    public String getScriptId() {
	return scriptId;
    }

    public void setScriptId(String scriptId) {
	this.scriptId = scriptId;
    }

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

    public String getInterpreterType() {
	return interpreterType;
    }

    public void setInterpreterType(String interpreterType) {
	this.interpreterType = interpreterType;
    }

    public String getActiveVersion() {
	return activeVersion;
    }

    public void setActiveVersion(String activeVersion) {
	this.activeVersion = activeVersion;
    }
}
