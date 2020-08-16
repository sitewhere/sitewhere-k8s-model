/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.infra.catalog.itemgroup;

import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.client.CustomResource;

/**
 * InfraCatalogItemGroup CRD.
 */
public class InfraCatalogItemGroup extends CustomResource {

    /** Serial version UID */
    private static final long serialVersionUID = 911001903144684838L;

    /** Specification */
    private InfraCatalogItemGroupSpec spec = new InfraCatalogItemGroupSpec();

    /** Status */
    private InfraCatalogItemGroupStatus status = new InfraCatalogItemGroupStatus();

    /*
     * @see io.fabric8.kubernetes.client.CustomResource#getMetadata()
     */
    @Override
    public ObjectMeta getMetadata() {
	return super.getMetadata();
    }

    public InfraCatalogItemGroupSpec getSpec() {
	return spec;
    }

    public void setSpec(InfraCatalogItemGroupSpec spec) {
	this.spec = spec;
    }

    public InfraCatalogItemGroupStatus getStatus() {
	return status;
    }

    public void setStatus(InfraCatalogItemGroupStatus status) {
	this.status = status;
    }
}
