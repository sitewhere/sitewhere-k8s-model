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
