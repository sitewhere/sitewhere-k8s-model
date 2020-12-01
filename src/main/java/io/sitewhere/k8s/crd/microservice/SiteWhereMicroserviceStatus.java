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

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.fabric8.kubernetes.api.model.KubernetesResource;

/**
 * SiteWhereMicroservice CRD status.
 */
@JsonDeserialize(using = JsonDeserializer.None.class)
public class SiteWhereMicroserviceStatus implements KubernetesResource {

    /** Serial version UID */
    private static final long serialVersionUID = -8840313392749814085L;

    /** Name of the Deployment generated for this microservice */
    private String deployment;

    /** Name of the Services generated for this microservice */
    private List<String> services = new ArrayList<String>();

    public String getDeployment() {
	return deployment;
    }

    public void setDeployment(String deployment) {
	this.deployment = deployment;
    }

    public List<String> getServices() {
	return services;
    }

    public void setServices(List<String> services) {
	this.services = services;
    }
}
