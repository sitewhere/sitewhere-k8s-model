/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.tenant.engine;

import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.client.CustomResource;

/**
 * SiteWhereTenantEngine CRD.
 */
public class SiteWhereTenantEngine extends CustomResource {

    /** Serial version UID */
    private static final long serialVersionUID = 2384776231314254963L;

    /** Tenant engine specification */
    private SiteWhereTenantEngineSpec spec;

    /** Tenant engine status */
    private SiteWhereTenantEngineStatus status;

    /*
     * @see io.fabric8.kubernetes.client.CustomResource#getMetadata()
     */
    @Override
    public ObjectMeta getMetadata() {
	return super.getMetadata();
    }

    public SiteWhereTenantEngineSpec getSpec() {
	return spec;
    }

    public void setSpec(SiteWhereTenantEngineSpec spec) {
	this.spec = spec;
    }

    public SiteWhereTenantEngineStatus getStatus() {
	return status;
    }

    public void setStatus(SiteWhereTenantEngineStatus status) {
	this.status = status;
    }
}
