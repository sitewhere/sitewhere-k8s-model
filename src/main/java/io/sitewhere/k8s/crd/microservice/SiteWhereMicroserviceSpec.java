/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.microservice;

import java.util.Map;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.sitewhere.k8s.crd.common.ComponentHelmSpec;

/**
 * SiteWhereMicroservice CRD specification.
 */
@JsonDeserialize(using = JsonDeserializer.None.class)
public class SiteWhereMicroserviceSpec implements KubernetesResource {

    /** Serial version UID */
    private static final long serialVersionUID = -4468391827753999167L;

    /** Microservice annotations */
    private Map<String, String> annotations;

    /** Number of replicas */
    private int replicas = 1;

    /** Parent instance name */
    private String instanceName;

    /** Global instance XML configuration */
    private JsonNode configuration;

    /** Functional area */
    private String functionalArea;

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

    public Map<String, String> getAnnotations() {
	return annotations;
    }

    public void setAnnotations(Map<String, String> annotations) {
	this.annotations = annotations;
    }

    public int getReplicas() {
	return replicas;
    }

    public void setReplicas(int replicas) {
	this.replicas = replicas;
    }

    public String getInstanceName() {
	return instanceName;
    }

    public void setInstanceName(String instanceName) {
	this.instanceName = instanceName;
    }

    public JsonNode getConfiguration() {
	return configuration;
    }

    public void setConfiguration(JsonNode configuration) {
	this.configuration = configuration;
    }

    public String getFunctionalArea() {
	return functionalArea;
    }

    public void setFunctionalArea(String functionalArea) {
	this.functionalArea = functionalArea;
    }

    public boolean isMultitenant() {
	return multitenant;
    }

    public void setMultitenant(boolean multitenant) {
	this.multitenant = multitenant;
    }

    public ComponentHelmSpec getHelm() {
	return helm;
    }

    public void setHelm(ComponentHelmSpec helm) {
	this.helm = helm;
    }

    public MicroservicePodSpecification getPodSpec() {
	return podSpec;
    }

    public void setPodSpec(MicroservicePodSpecification podSpec) {
	this.podSpec = podSpec;
    }

    public MicroserviceServiceSpecification getServiceSpec() {
	return serviceSpec;
    }

    public void setServiceSpec(MicroserviceServiceSpecification serviceSpec) {
	this.serviceSpec = serviceSpec;
    }

    public MicroserviceDebugSpecification getDebug() {
	return debug;
    }

    public void setDebug(MicroserviceDebugSpecification debug) {
	this.debug = debug;
    }
}
