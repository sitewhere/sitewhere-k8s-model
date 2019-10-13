/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.microservice;

import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.client.CustomResource;

/**
 * SiteWhereMicroservice CRD.
 */
public class SiteWhereMicroservice extends CustomResource {

    /** Serial version UID */
    private static final long serialVersionUID = -1262437143281432071L;

    /** Microservice specification */
    private SiteWhereMicroserviceSpec spec;

    /** Microservice status */
    private SiteWhereMicroserviceStatus status;

    /*
     * @see io.fabric8.kubernetes.client.CustomResource#getMetadata()
     */
    @Override
    public ObjectMeta getMetadata() {
	return super.getMetadata();
    }

    public SiteWhereMicroserviceSpec getSpec() {
	return spec;
    }

    public void setSpec(SiteWhereMicroserviceSpec spec) {
	this.spec = spec;
    }

    public SiteWhereMicroserviceStatus getStatus() {
	return status;
    }

    public void setStatus(SiteWhereMicroserviceStatus status) {
	this.status = status;
    }
}
