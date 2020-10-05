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
