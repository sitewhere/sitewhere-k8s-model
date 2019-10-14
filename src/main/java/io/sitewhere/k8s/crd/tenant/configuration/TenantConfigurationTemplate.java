/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
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
