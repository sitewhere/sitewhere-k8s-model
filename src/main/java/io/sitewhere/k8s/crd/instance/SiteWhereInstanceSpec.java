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
package io.sitewhere.k8s.crd.instance;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.sitewhere.k8s.api.instance.ISiteWhereInstanceSpec;

/**
 * SiteWhereInstance CRD specification.
 */
@JsonDeserialize(using = JsonDeserializer.None.class)
public class SiteWhereInstanceSpec implements KubernetesResource, ISiteWhereInstanceSpec {

    /** Serial version UID */
    private static final long serialVersionUID = -8588114929765353983L;

    /** Instance name */
    private String name;

    /** Instance description */
    private String description;

    /** Instance configuration template name */
    private String configurationTemplate;

    /** Instance dataset template name */
    private String datasetTemplate;

    /** Global instance XML configuration */
    private JsonNode configuration;

    /*
     * @see io.sitewhere.k8s.api.instance.ISiteWhereInstanceSpec#getName()
     */
    @Override
    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    /*
     * @see io.sitewhere.k8s.api.instance.ISiteWhereInstanceSpec#getDescription()
     */
    @Override
    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    /*
     * @see
     * io.sitewhere.k8s.api.instance.ISiteWhereInstanceSpec#getConfigurationTemplate
     * ()
     */
    @Override
    public String getConfigurationTemplate() {
	return configurationTemplate;
    }

    public void setConfigurationTemplate(String configurationTemplate) {
	this.configurationTemplate = configurationTemplate;
    }

    /*
     * @see
     * io.sitewhere.k8s.api.instance.ISiteWhereInstanceSpec#getDatasetTemplate()
     */
    @Override
    public String getDatasetTemplate() {
	return datasetTemplate;
    }

    public void setDatasetTemplate(String datasetTemplate) {
	this.datasetTemplate = datasetTemplate;
    }

    /*
     * @see io.sitewhere.k8s.api.instance.ISiteWhereInstanceSpec#getConfiguration()
     */
    @Override
    public JsonNode getConfiguration() {
	return configuration;
    }

    public void setConfiguration(JsonNode configuration) {
	this.configuration = configuration;
    }
}
