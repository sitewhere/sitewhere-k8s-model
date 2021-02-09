/**
 * Copyright © 2014-2021 The SiteWhere Authors
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
package io.sitewhere.k8s.crd.tenant.engine;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.sitewhere.k8s.crd.common.BootstrapState;

/**
 * SiteWhereTenantEngine CRD status.
 */
@JsonDeserialize(using = JsonDeserializer.None.class)
public class SiteWhereTenantEngineStatus implements KubernetesResource {

    /** Serial version UID */
    private static final long serialVersionUID = 2812411676466723825L;

    /** Indicates if an instance has been bootstrapped */
    private BootstrapState bootstrapState = BootstrapState.NotBootstrapped;

    public BootstrapState getBootstrapState() {
	return bootstrapState;
    }

    public void setBootstrapState(BootstrapState bootstrapState) {
	this.bootstrapState = bootstrapState;
    }
}
