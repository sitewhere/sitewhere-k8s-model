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

/**
 * Settings specific to configuring microservice log levels.
 */
public class MicroserviceLoggingSpecification {

    /** List of logging overrides */
    private List<MicroserviceLoggingEntry> overrides = new ArrayList<>();

    public List<MicroserviceLoggingEntry> getOverrides() {
	return overrides;
    }

    public void setOverrides(List<MicroserviceLoggingEntry> overrides) {
	this.overrides = overrides;
    }
}
