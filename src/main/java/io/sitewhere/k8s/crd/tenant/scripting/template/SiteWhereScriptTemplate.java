/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.tenant.scripting.template;

import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.client.CustomResource;

/**
 * SiteWhereScriptTemplate CRD.
 */
public class SiteWhereScriptTemplate extends CustomResource {

    /** Serial version UID */
    private static final long serialVersionUID = 4752770422639753964L;

    /** Script specification */
    private SiteWhereScriptTemplateSpec spec = new SiteWhereScriptTemplateSpec();

    /** Script status */
    private SiteWhereScriptTemplateStatus status = new SiteWhereScriptTemplateStatus();

    /*
     * @see io.fabric8.kubernetes.client.CustomResource#getMetadata()
     */
    @Override
    public ObjectMeta getMetadata() {
	return super.getMetadata();
    }

    public SiteWhereScriptTemplateSpec getSpec() {
	return spec;
    }

    public void setSpec(SiteWhereScriptTemplateSpec spec) {
	this.spec = spec;
    }

    public SiteWhereScriptTemplateStatus getStatus() {
	return status;
    }

    public void setStatus(SiteWhereScriptTemplateStatus status) {
	this.status = status;
    }
}
