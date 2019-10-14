/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.tenant.engine.dataset;

import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.client.CustomResource;

/**
 * TenantEngineDatasetTemplate CRD.
 */
public class TenantEngineDatasetTemplate extends CustomResource {

    /** Serial version UID */
    private static final long serialVersionUID = -338468202267120522L;

    /** Template specification */
    private TenantEngineDatasetTemplateSpec spec;

    /** Template status */
    private TenantEngineDatasetTemplateStatus status;

    /*
     * @see io.fabric8.kubernetes.client.CustomResource#getMetadata()
     */
    @Override
    public ObjectMeta getMetadata() {
	return super.getMetadata();
    }

    public TenantEngineDatasetTemplateSpec getSpec() {
	return spec;
    }

    public void setSpec(TenantEngineDatasetTemplateSpec spec) {
	this.spec = spec;
    }

    public TenantEngineDatasetTemplateStatus getStatus() {
	return status;
    }

    public void setStatus(TenantEngineDatasetTemplateStatus status) {
	this.status = status;
    }
}
