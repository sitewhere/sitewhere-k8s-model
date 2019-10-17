/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.common;

public class ComponentHelmSpec {

    /** Helm chart name */
    private String chartName;

    /** Helm release name */
    private String releaseName;

    /** Helm release service */
    private String releaseService;

    public String getChartName() {
	return chartName;
    }

    public void setChartName(String chartName) {
	this.chartName = chartName;
    }

    public String getReleaseName() {
	return releaseName;
    }

    public void setReleaseName(String releaseName) {
	this.releaseName = releaseName;
    }

    public String getReleaseService() {
	return releaseService;
    }

    public void setReleaseService(String releaseService) {
	this.releaseService = releaseService;
    }
}
