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
