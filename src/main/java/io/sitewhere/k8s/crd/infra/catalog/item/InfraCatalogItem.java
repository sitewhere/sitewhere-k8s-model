/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.infra.catalog.item;

import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.client.CustomResource;

/**
 * InfraCatalogItem CRD.
 */
public class InfraCatalogItem extends CustomResource {

    /** Serial version UID */
    private static final long serialVersionUID = -4960745066537773924L;

    /** Specification */
    private InfraCatalogItemSpec spec = new InfraCatalogItemSpec();

    /** Status */
    private InfraCatalogItemStatus status = new InfraCatalogItemStatus();

    /*
     * @see io.fabric8.kubernetes.client.CustomResource#getMetadata()
     */
    @Override
    public ObjectMeta getMetadata() {
	return super.getMetadata();
    }

    public InfraCatalogItemSpec getSpec() {
	return spec;
    }

    public void setSpec(InfraCatalogItemSpec spec) {
	this.spec = spec;
    }

    public InfraCatalogItemStatus getStatus() {
	return status;
    }

    public void setStatus(InfraCatalogItemStatus status) {
	this.status = status;
    }
}
