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
package io.sitewhere.k8s.api.microservice;

import com.fasterxml.jackson.databind.JsonNode;

import io.sitewhere.k8s.crd.common.ComponentHelmSpec;
import io.sitewhere.k8s.crd.microservice.MicroserviceDebugSpecification;
import io.sitewhere.k8s.crd.microservice.MicroserviceLoggingSpecification;
import io.sitewhere.k8s.crd.microservice.MicroservicePodSpecification;
import io.sitewhere.k8s.crd.microservice.MicroserviceServiceSpecification;

public interface ISiteWhereMicroserviceSpec {

    /**
     * Name displayed for microservice
     */
    String getName();

    /**
     * Microservice description
     */
    String getDescription();

    /**
     * Icon displayed for microservice
     */
    String getIcon();

    /**
     * Functional area for service.
     * 
     * @return
     */
    String getFunctionalArea();

    /**
     * Number of replicas
     */
    int getReplicas();

    /**
     * Global instance XML configuration
     */
    JsonNode getConfiguration();

    /**
     * Indicates whether microservice has tenant engines
     */
    boolean isMultitenant();

    /**
     * Helm information
     */
    ComponentHelmSpec getHelm();

    /**
     * Pod specification
     */
    MicroservicePodSpecification getPodSpec();

    /**
     * Service specification
     */
    MicroserviceServiceSpecification getServiceSpec();

    /**
     * Debug specification
     */
    MicroserviceDebugSpecification getDebug();

    /**
     * Logging specification
     */
    MicroserviceLoggingSpecification getLogging();
}
