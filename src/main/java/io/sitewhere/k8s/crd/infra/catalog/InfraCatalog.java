/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.infra.catalog;

import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.client.CustomResource;

/**
 * InfraCatalog CRD.
 */
public class InfraCatalog extends CustomResource {

    /** Serial version UID */
    private static final long serialVersionUID = 2238184311982140621L;

    /** Specification */
    private InfraCatalogSpec spec = new InfraCatalogSpec();

    /** Status */
    private InfraCatalogStatus status = new InfraCatalogStatus();

    /*
     * @see io.fabric8.kubernetes.client.CustomResource#getMetadata()
     */
    @Override
    public ObjectMeta getMetadata() {
	return super.getMetadata();
    }

    public InfraCatalogSpec getSpec() {
	return spec;
    }

    public void setSpec(InfraCatalogSpec spec) {
	this.spec = spec;
    }

    public InfraCatalogStatus getStatus() {
	return status;
    }

    public void setStatus(InfraCatalogStatus status) {
	this.status = status;
    }
}
