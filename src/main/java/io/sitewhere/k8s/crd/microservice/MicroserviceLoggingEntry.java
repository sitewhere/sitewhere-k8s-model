/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.microservice;

/**
 * Entry that specifies the log level for a logger.
 */
public class MicroserviceLoggingEntry {

    /** Affected logger */
    private String logger;

    /** Logging level */
    private String level;

    public String getLogger() {
	return logger;
    }

    public void setLogger(String logger) {
	this.logger = logger;
    }

    public String getLevel() {
	return level;
    }

    public void setLevel(String level) {
	this.level = level;
    }
}
