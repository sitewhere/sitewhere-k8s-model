/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.infra.catalog.item;

/**
 * Information required to specify a Helm chart.
 */
public class HelmChartMetadata {

    /** Repository URL */
    private String repositoryUrl;

    /** Chart name */
    private String chartName;

    /** Chart version */
    private String chartVersion;

    public String getRepositoryUrl() {
	return repositoryUrl;
    }

    public void setRepositoryUrl(String repositoryUrl) {
	this.repositoryUrl = repositoryUrl;
    }

    public String getChartName() {
	return chartName;
    }

    public void setChartName(String chartName) {
	this.chartName = chartName;
    }

    public String getChartVersion() {
	return chartVersion;
    }

    public void setChartVersion(String chartVersion) {
	this.chartVersion = chartVersion;
    }
}
