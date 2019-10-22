/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.tenant.dataset;

import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.client.CustomResource;

/**
 * TenantDatasetTemplate CRD.
 */
public class TenantDatasetTemplate extends CustomResource {

    /** Serial version UID */
    private static final long serialVersionUID = -3663227455158425945L;

    /** TenantDatasetTemplate specification */
    private TenantDatasetTemplateSpec spec;

    /** TenantDatasetTemplate status */
    private TenantDatasetTemplateStatus status;

    /*
     * @see io.fabric8.kubernetes.client.CustomResource#getMetadata()
     */
    @Override
    public ObjectMeta getMetadata() {
	return super.getMetadata();
    }

    public TenantDatasetTemplateSpec getSpec() {
	return spec;
    }

    public void setSpec(TenantDatasetTemplateSpec spec) {
	this.spec = spec;
    }

    public TenantDatasetTemplateStatus getStatus() {
	return status;
    }

    public void setStatus(TenantDatasetTemplateStatus status) {
	this.status = status;
    }
}
