/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.tenant.scripting;

import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.client.CustomResource;

/**
 * SiteWhereScript CRD.
 */
public class SiteWhereScript extends CustomResource {

    /** Serial version UID */
    private static final long serialVersionUID = 4752770422639753964L;

    /** Script specification */
    private SiteWhereScriptSpec spec = new SiteWhereScriptSpec();

    /** Script status */
    private SiteWhereScriptStatus status = new SiteWhereScriptStatus();

    /*
     * @see io.fabric8.kubernetes.client.CustomResource#getMetadata()
     */
    @Override
    public ObjectMeta getMetadata() {
	return super.getMetadata();
    }

    public SiteWhereScriptSpec getSpec() {
	return spec;
    }

    public void setSpec(SiteWhereScriptSpec spec) {
	this.spec = spec;
    }

    public SiteWhereScriptStatus getStatus() {
	return status;
    }

    public void setStatus(SiteWhereScriptStatus status) {
	this.status = status;
    }
}
