/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.microservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import io.fabric8.kubernetes.api.model.ContainerPort;
import io.fabric8.kubernetes.api.model.EnvVar;
import io.fabric8.kubernetes.api.model.Probe;
import io.fabric8.kubernetes.api.model.ResourceRequirements;

/**
 * Settings specific to microservice pods.
 */
public class MicroservicePodSpecification {

    /** Pod annotations */
    private Map<String, String> annotations;

    /** Pod name */
    private String name;

    /** Pod registry */
    private String imageRegistry;

    /** Pod repository */
    private String imageRepository;

    /** Pod tag */
    private String imageTag;

    /** Image pull policy */
    private String imagePullPolicy;

    /** List of container ports */
    private List<ContainerPort> ports = new ArrayList<ContainerPort>();

    /** Environment variables */
    private List<EnvVar> env = new ArrayList<EnvVar>();

    /** Resource requirements */
    private ResourceRequirements resources;

    /** Readiness probe */
    private Probe readinessProbe;

    /** Liveness probe */
    private Probe livenessProbe;

    public Map<String, String> getAnnotations() {
	return annotations;
    }

    public void setAnnotations(Map<String, String> annotations) {
	this.annotations = annotations;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getImageRegistry() {
	return imageRegistry;
    }

    public void setImageRegistry(String imageRegistry) {
	this.imageRegistry = imageRegistry;
    }

    public String getImageRepository() {
	return imageRepository;
    }

    public void setImageRepository(String imageRepository) {
	this.imageRepository = imageRepository;
    }

    public String getImageTag() {
	return imageTag;
    }

    public void setImageTag(String imageTag) {
	this.imageTag = imageTag;
    }

    public String getImagePullPolicy() {
	return imagePullPolicy;
    }

    public void setImagePullPolicy(String imagePullPolicy) {
	this.imagePullPolicy = imagePullPolicy;
    }

    public List<ContainerPort> getPorts() {
	return ports;
    }

    public void setPorts(List<ContainerPort> ports) {
	this.ports = ports;
    }

    public List<EnvVar> getEnv() {
	return env;
    }

    public void setEnv(List<EnvVar> env) {
	this.env = env;
    }

    public ResourceRequirements getResources() {
	return resources;
    }

    public void setResources(ResourceRequirements resources) {
	this.resources = resources;
    }

    public Probe getReadinessProbe() {
	return readinessProbe;
    }

    public void setReadinessProbe(Probe readinessProbe) {
	this.readinessProbe = readinessProbe;
    }

    public Probe getLivenessProbe() {
	return livenessProbe;
    }

    public void setLivenessProbe(Probe livenessProbe) {
	this.livenessProbe = livenessProbe;
    }
}
