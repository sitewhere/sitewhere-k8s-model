/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.infra.catalog.item;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.fabric8.kubernetes.api.model.KubernetesResource;

/**
 * InfraCatalogItem CRD specification.
 */
@JsonDeserialize(using = JsonDeserializer.None.class)
public class InfraCatalogItemSpec implements KubernetesResource {

    /** Serial version UID */
    private static final long serialVersionUID = -2845832410367646572L;

    /** Catalog name */
    private String name;

    /** Catalog description */
    private String description;

    /** Helm chart metadata */
    private HelmChartMetadata helm;

    /** Default component configuration */
    private JsonNode defaultConfiguration;

    /** Allow multiple components for this item? */
    private boolean allowMultiple;

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

    public HelmChartMetadata getHelm() {
	return helm;
    }

    public void setHelm(HelmChartMetadata helm) {
	this.helm = helm;
    }

    public JsonNode getDefaultConfiguration() {
	return defaultConfiguration;
    }

    public void setDefaultConfiguration(JsonNode defaultConfiguration) {
	this.defaultConfiguration = defaultConfiguration;
    }

    public boolean isAllowMultiple() {
	return allowMultiple;
    }

    public void setAllowMultiple(boolean allowMultiple) {
	this.allowMultiple = allowMultiple;
    }
}
