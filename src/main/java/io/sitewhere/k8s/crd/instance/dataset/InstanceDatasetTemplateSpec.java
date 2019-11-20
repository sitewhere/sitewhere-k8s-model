/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.instance.dataset;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.fabric8.kubernetes.api.model.KubernetesResource;

/**
 * InstanceDatasetTemplate CRD specification.
 */
@JsonDeserialize(using = JsonDeserializer.None.class)
public class InstanceDatasetTemplateSpec implements KubernetesResource {

    /** Serial version UID */
    private static final long serialVersionUID = 1024070640571988118L;

    /** Datasets indexed by functional area */
    private Map<String, String> datasets = new HashMap<>();

    public Map<String, String> getDatasets() {
	return datasets;
    }

    public void setDatasets(Map<String, String> datasets) {
	this.datasets = datasets;
    }
}