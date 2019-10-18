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

import io.fabric8.kubernetes.api.model.ServicePort;

/**
 * Settings specific to microservice service.
 */
public class MicroserviceServiceSpecification {

    /** Service type */
    private String type = "LoadBalancer";

    /** Ports */
    private List<ServicePort> ports = new ArrayList<ServicePort>();

    public String getType() {
	return type;
    }

    public void setType(String type) {
	this.type = type;
    }

    public List<ServicePort> getPorts() {
	return ports;
    }

    public void setPorts(List<ServicePort> ports) {
	this.ports = ports;
    }
}
