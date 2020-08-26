/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
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
