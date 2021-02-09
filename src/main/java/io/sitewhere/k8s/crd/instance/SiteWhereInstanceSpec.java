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
package io.sitewhere.k8s.crd.instance;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.sitewhere.k8s.api.instance.IDockerSpec;
import io.sitewhere.k8s.api.instance.ISiteWhereInstanceSpec;
import io.sitewhere.k8s.api.microservice.ISiteWhereMicroserviceSpec;
import io.sitewhere.k8s.crd.microservice.SiteWhereMicroserviceSpec;

/**
 * SiteWhereInstance CRD specification.
 */
@JsonInclude(Include.NON_NULL)
@JsonDeserialize(using = JsonDeserializer.None.class)
public class SiteWhereInstanceSpec implements KubernetesResource, ISiteWhereInstanceSpec {

    /** Serial version UID */
    private static final long serialVersionUID = -8588114929765353983L;

    /** Name displayed for instance */
    private String name;

    /** Description displayed for instance */
    private String description;

    /** Instance configuration template name */
    private String configurationTemplate;

    /** Instance dataset template name */
    private String datasetTemplate;

    /** Docker specification */
    private DockerSpec dockerSpec;

    /** Global instance XML configuration */
    private JsonNode configuration;

    /** List of microservices in instance */
    private List<? extends ISiteWhereMicroserviceSpec> microservices = new ArrayList<>();

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

    /*
     * @see io.sitewhere.k8s.api.instance.ISiteWhereInstanceSpec#getDockerSpec()
     */
    @Override
    public IDockerSpec getDockerSpec() {
	return this.dockerSpec;
    }

    public void setDockerSpec(DockerSpec dockerSpec) {
	this.dockerSpec = dockerSpec;
    }

    /*
     * @see io.sitewhere.k8s.api.instance.ISiteWhereInstanceSpec#getMicroservices()
     */
    @Override
    public List<? extends ISiteWhereMicroserviceSpec> getMicroservices() {
	return microservices;
    }

    public void setMicroservices(List<SiteWhereMicroserviceSpec> microservices) {
	this.microservices = microservices;
    }
}
