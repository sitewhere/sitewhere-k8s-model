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
package io.sitewhere.k8s.crd.instance;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.sitewhere.k8s.crd.common.BootstrapState;

/**
 * SiteWhereInstance CRD status.
 */
@JsonDeserialize(using = JsonDeserializer.None.class)
public class SiteWhereInstanceStatus implements KubernetesResource {

    /** Serial version UID */
    private static final long serialVersionUID = 849148365787926189L;

    /** Indicates if tenant management has been bootstrapped */
    private BootstrapState tenantManagementBootstrapState = BootstrapState.NotBootstrapped;

    /** Indicates if user management has been bootstrapped */
    private BootstrapState userManagementBootstrapState = BootstrapState.NotBootstrapped;

    public BootstrapState getTenantManagementBootstrapState() {
	return tenantManagementBootstrapState;
    }

    public void setTenantManagementBootstrapState(BootstrapState tenantManagementBootstrapState) {
	this.tenantManagementBootstrapState = tenantManagementBootstrapState;
    }

    public BootstrapState getUserManagementBootstrapState() {
	return userManagementBootstrapState;
    }

    public void setUserManagementBootstrapState(BootstrapState userManagementBootstrapState) {
	this.userManagementBootstrapState = userManagementBootstrapState;
    }
}
