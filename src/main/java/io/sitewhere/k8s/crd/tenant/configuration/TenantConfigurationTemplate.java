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
package io.sitewhere.k8s.crd.tenant.configuration;

import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.client.CustomResource;

/**
 * TenantConfigurationTemplate CRD.
 */
public class TenantConfigurationTemplate extends CustomResource {

    /** Serial version UID */
    private static final long serialVersionUID = 90128208321609273L;

    /** Tenant specification */
    private TenantConfigurationTemplateSpec spec;

    /** Tenant status */
    private TenantConfigurationTemplateStatus status;

    /*
     * @see io.fabric8.kubernetes.client.CustomResource#getMetadata()
     */
    @Override
    public ObjectMeta getMetadata() {
	return super.getMetadata();
    }

    public TenantConfigurationTemplateSpec getSpec() {
	return spec;
    }

    public void setSpec(TenantConfigurationTemplateSpec spec) {
	this.spec = spec;
    }

    public TenantConfigurationTemplateStatus getStatus() {
	return status;
    }

    public void setStatus(TenantConfigurationTemplateStatus status) {
	this.status = status;
    }
}
