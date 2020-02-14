/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
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
