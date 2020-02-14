/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.tenant.scripting.template;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.fabric8.kubernetes.api.model.KubernetesResource;

/**
 * SiteWhereScriptTemplate CRD specification.
 */
@JsonDeserialize(using = JsonDeserializer.None.class)
public class SiteWhereScriptTemplateSpec implements KubernetesResource {

    /** Serial version UID */
    private static final long serialVersionUID = 4418530241331241674L;

    /** Name */
    private String name;

    /** Description */
    private String description;

    /** Interpreter type */
    private String interpreterType;

    /** Template content */
    private String script;

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

    public String getScript() {
	return script;
    }

    public void setScript(String script) {
	this.script = script;
    }
}
