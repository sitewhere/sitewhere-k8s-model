/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.tenant.scripting.version;

import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.client.CustomResource;

/**
 * SiteWhereScriptVersion CRD.
 */
public class SiteWhereScriptVersion extends CustomResource {

    /** Serial version UID */
    private static final long serialVersionUID = 4752770422639753964L;

    /** Script specification */
    private SiteWhereScriptVersionSpec spec = new SiteWhereScriptVersionSpec();

    /** Script status */
    private SiteWhereScriptVersionStatus status = new SiteWhereScriptVersionStatus();

    /*
     * @see io.fabric8.kubernetes.client.CustomResource#getMetadata()
     */
    @Override
    public ObjectMeta getMetadata() {
	return super.getMetadata();
    }

    public SiteWhereScriptVersionSpec getSpec() {
	return spec;
    }

    public void setSpec(SiteWhereScriptVersionSpec spec) {
	this.spec = spec;
    }

    public SiteWhereScriptVersionStatus getStatus() {
	return status;
    }

    public void setStatus(SiteWhereScriptVersionStatus status) {
	this.status = status;
    }
}
