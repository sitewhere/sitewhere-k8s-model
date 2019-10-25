/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.instance;

import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.client.CustomResource;

/**
 * SiteWhereInstance CRD.
 */
public class SiteWhereInstance extends CustomResource {

    /** Serial version UID */
    private static final long serialVersionUID = 9047754703679419557L;

    /** Instance specification */
    private SiteWhereInstanceSpec spec = new SiteWhereInstanceSpec();

    /** Instance status */
    private SiteWhereInstanceStatus status = new SiteWhereInstanceStatus();

    /*
     * @see io.fabric8.kubernetes.client.CustomResource#getMetadata()
     */
    @Override
    public ObjectMeta getMetadata() {
	return super.getMetadata();
    }

    public SiteWhereInstanceSpec getSpec() {
	return spec;
    }

    public void setSpec(SiteWhereInstanceSpec spec) {
	this.spec = spec;
    }

    public SiteWhereInstanceStatus getStatus() {
	return status;
    }

    public void setStatus(SiteWhereInstanceStatus status) {
	this.status = status;
    }
}
