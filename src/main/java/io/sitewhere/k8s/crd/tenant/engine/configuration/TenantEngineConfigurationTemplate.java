/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.tenant.engine.configuration;

import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.client.CustomResource;

/**
 * TenantEngineConfigurationTemplate CRD.
 */
public class TenantEngineConfigurationTemplate extends CustomResource {

    /** Serial version UID */
    private static final long serialVersionUID = 5511619346425650512L;

    /** Tenant engine specification */
    private TenantEngineConfigurationTemplateSpec spec;

    /** Tenant engine status */
    private TenantEngineConfigurationTemplateStatus status;

    /*
     * @see io.fabric8.kubernetes.client.CustomResource#getMetadata()
     */
    @Override
    public ObjectMeta getMetadata() {
	return super.getMetadata();
    }

    public TenantEngineConfigurationTemplateSpec getSpec() {
	return spec;
    }

    public void setSpec(TenantEngineConfigurationTemplateSpec spec) {
	this.spec = spec;
    }

    public TenantEngineConfigurationTemplateStatus getStatus() {
	return status;
    }

    public void setStatus(TenantEngineConfigurationTemplateStatus status) {
	this.status = status;
    }
}
