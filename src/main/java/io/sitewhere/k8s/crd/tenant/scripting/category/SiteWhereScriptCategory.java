/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.tenant.scripting.category;

import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.client.CustomResource;

/**
 * SiteWhereScriptCategory CRD.
 */
public class SiteWhereScriptCategory extends CustomResource {

    /** Serial version UID */
    private static final long serialVersionUID = 4752770422639753964L;

    /** Script specification */
    private SiteWhereScriptCategorySpec spec = new SiteWhereScriptCategorySpec();

    /** Script status */
    private SiteWhereScriptCategoryStatus status = new SiteWhereScriptCategoryStatus();

    /*
     * @see io.fabric8.kubernetes.client.CustomResource#getMetadata()
     */
    @Override
    public ObjectMeta getMetadata() {
	return super.getMetadata();
    }

    public SiteWhereScriptCategorySpec getSpec() {
	return spec;
    }

    public void setSpec(SiteWhereScriptCategorySpec spec) {
	this.spec = spec;
    }

    public SiteWhereScriptCategoryStatus getStatus() {
	return status;
    }

    public void setStatus(SiteWhereScriptCategoryStatus status) {
	this.status = status;
    }
}
