/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.microservice;

/**
 * Settings specific to microservice debugger settings.
 */
public class MicroserviceDebugSpecification {

    /** Enablement flag */
    private boolean enabled = false;

    /** JWDP port */
    private Integer jdwpPort;

    /** JMX port */
    private Integer jmxPort;

    public boolean isEnabled() {
	return enabled;
    }

    public void setEnabled(boolean enabled) {
	this.enabled = enabled;
    }

    public Integer getJdwpPort() {
	return jdwpPort;
    }

    public void setJdwpPort(Integer jdwpPort) {
	this.jdwpPort = jdwpPort;
    }

    public Integer getJmxPort() {
	return jmxPort;
    }

    public void setJmxPort(Integer jmxPort) {
	this.jmxPort = jmxPort;
    }
}
