/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.tenant;

import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.client.CustomResource;

/**
 * SiteWhereTenant CRD.
 */
public class SiteWhereTenant extends CustomResource {

    /** Serial version UID */
    private static final long serialVersionUID = 5799369770823529968L;

    /** Tenant specification */
    private SiteWhereTenantSpec spec = new SiteWhereTenantSpec();

    /** Tenant status */
    private SiteWhereTenantStatus status = new SiteWhereTenantStatus();

    /*
     * @see io.fabric8.kubernetes.client.CustomResource#getMetadata()
     */
    @Override
    public ObjectMeta getMetadata() {
	return super.getMetadata();
    }

    public SiteWhereTenantSpec getSpec() {
	return spec;
    }

    public void setSpec(SiteWhereTenantSpec spec) {
	this.spec = spec;
    }

    public SiteWhereTenantStatus getStatus() {
	return status;
    }

    public void setStatus(SiteWhereTenantStatus status) {
	this.status = status;
    }
}
