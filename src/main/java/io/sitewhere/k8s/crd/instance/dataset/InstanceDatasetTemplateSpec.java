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
package io.sitewhere.k8s.crd.instance.dataset;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.sitewhere.k8s.api.instance.IInstanceDatasetTemplateSpec;

/**
 * InstanceDatasetTemplate CRD specification.
 */
@JsonDeserialize(using = JsonDeserializer.None.class)
public class InstanceDatasetTemplateSpec implements KubernetesResource, IInstanceDatasetTemplateSpec {

    /** Serial version UID */
    private static final long serialVersionUID = 1024070640571988118L;

    /** Datasets indexed by functional area */
    private Map<String, String> datasets = new HashMap<>();

    /*
     * @see io.sitewhere.k8s.api.instance.IInstanceDatasetTemplateSpec#getDatasets()
     */
    @Override
    public Map<String, String> getDatasets() {
	return datasets;
    }

    public void setDatasets(Map<String, String> datasets) {
	this.datasets = datasets;
    }
}
