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
package io.sitewhere.k8s.crd.microservice;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.sitewhere.k8s.api.microservice.ISiteWhereMicroserviceSpec;
import io.sitewhere.k8s.crd.common.ComponentHelmSpec;

/**
 * SiteWhereMicroservice CRD specification.
 */
@JsonDeserialize(using = JsonDeserializer.None.class)
public class SiteWhereMicroserviceSpec implements KubernetesResource, ISiteWhereMicroserviceSpec {

    /** Serial version UID */
    private static final long serialVersionUID = -4468391827753999167L;

    /** Name displayed for microservice */
    private String name;

    /** Microservice description */
    private String description;

    /** Icon displayed for microservice */
    private String icon;

    /** Functional area */
    private String functionalArea;

    /** Number of replicas */
    private int replicas = 1;

    /** Global instance XML configuration */
    private JsonNode configuration;

    /** Indicates whether microservice has tenant engines */
    private boolean multitenant = false;

    /** Helm information */
    private ComponentHelmSpec helm;

    /** Pod specification */
    private MicroservicePodSpecification podSpec;

    /** Service specification */
    private MicroserviceServiceSpecification serviceSpec;

    /** Debug specification */
    private MicroserviceDebugSpecification debug;

    /** Logging specification */
    private MicroserviceLoggingSpecification logging;

    /*
     * @see io.sitewhere.k8s.api.microservice.ISiteWhereMicroserviceSpec#getName()
     */
    @Override
    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    /*
     * @see
     * io.sitewhere.k8s.api.microservice.ISiteWhereMicroserviceSpec#getDescription()
     */
    @Override
    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    /*
     * @see io.sitewhere.k8s.api.microservice.ISiteWhereMicroserviceSpec#getIcon()
     */
    @Override
    public String getIcon() {
	return icon;
    }

    public void setIcon(String icon) {
	this.icon = icon;
    }

    /*
     * @see io.sitewhere.k8s.api.microservice.ISiteWhereMicroserviceSpec#
     * getFunctionalArea()
     */
    @Override
    public String getFunctionalArea() {
	return functionalArea;
    }

    public void setFunctionalArea(String functionalArea) {
	this.functionalArea = functionalArea;
    }

    /*
     * @see
     * io.sitewhere.k8s.api.microservice.ISiteWhereMicroserviceSpec#getReplicas()
     */
    @Override
    public int getReplicas() {
	return replicas;
    }

    public void setReplicas(int replicas) {
	this.replicas = replicas;
    }

    /*
     * @see
     * io.sitewhere.k8s.api.microservice.ISiteWhereMicroserviceSpec#getConfiguration
     * ()
     */
    @Override
    public JsonNode getConfiguration() {
	return configuration;
    }

    public void setConfiguration(JsonNode configuration) {
	this.configuration = configuration;
    }

    /*
     * @see
     * io.sitewhere.k8s.api.microservice.ISiteWhereMicroserviceSpec#isMultitenant()
     */
    @Override
    public boolean isMultitenant() {
	return multitenant;
    }

    public void setMultitenant(boolean multitenant) {
	this.multitenant = multitenant;
    }

    /*
     * @see io.sitewhere.k8s.api.microservice.ISiteWhereMicroserviceSpec#getHelm()
     */
    @Override
    public ComponentHelmSpec getHelm() {
	return helm;
    }

    public void setHelm(ComponentHelmSpec helm) {
	this.helm = helm;
    }

    /*
     * @see
     * io.sitewhere.k8s.api.microservice.ISiteWhereMicroserviceSpec#getPodSpec()
     */
    @Override
    public MicroservicePodSpecification getPodSpec() {
	return podSpec;
    }

    public void setPodSpec(MicroservicePodSpecification podSpec) {
	this.podSpec = podSpec;
    }

    /*
     * @see
     * io.sitewhere.k8s.api.microservice.ISiteWhereMicroserviceSpec#getServiceSpec()
     */
    @Override
    public MicroserviceServiceSpecification getServiceSpec() {
	return serviceSpec;
    }

    public void setServiceSpec(MicroserviceServiceSpecification serviceSpec) {
	this.serviceSpec = serviceSpec;
    }

    /*
     * @see io.sitewhere.k8s.api.microservice.ISiteWhereMicroserviceSpec#getDebug()
     */
    @Override
    public MicroserviceDebugSpecification getDebug() {
	return debug;
    }

    public void setDebug(MicroserviceDebugSpecification debug) {
	this.debug = debug;
    }

    /*
     * @see
     * io.sitewhere.k8s.api.microservice.ISiteWhereMicroserviceSpec#getLogging()
     */
    @Override
    public MicroserviceLoggingSpecification getLogging() {
	return logging;
    }

    public void setLogging(MicroserviceLoggingSpecification logging) {
	this.logging = logging;
    }
}
