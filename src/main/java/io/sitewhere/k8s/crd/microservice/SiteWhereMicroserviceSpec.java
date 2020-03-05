/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.microservice;

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

    /** Name displayed for microservice */
    private String name;

    /** Microservice description */
    private String description;

    /** Icon displayed for microservice */
    private String icon;

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

    public String getIcon() {
	return icon;
    }

    public void setIcon(String icon) {
	this.icon = icon;
    }

    public int getReplicas() {
	return replicas;
    }

    public void setReplicas(int replicas) {
	this.replicas = replicas;
    }

    public JsonNode getConfiguration() {
	return configuration;
    }

    public void setConfiguration(JsonNode configuration) {
	this.configuration = configuration;
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
