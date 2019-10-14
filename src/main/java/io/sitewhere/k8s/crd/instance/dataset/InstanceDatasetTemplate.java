/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.instance.dataset;

import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.client.CustomResource;

/**
 * InstanceDatasetTemplate CRD.
 */
public class InstanceDatasetTemplate extends CustomResource {

    /** Serial version UID */
    private static final long serialVersionUID = 4577249517782303124L;

    /** Specification */
    private InstanceDatasetTemplateSpec spec;

    /** Status */
    private InstanceDatasetTemplateStatus status;

    /*
     * @see io.fabric8.kubernetes.client.CustomResource#getMetadata()
     */
    @Override
    public ObjectMeta getMetadata() {
	return super.getMetadata();
    }

    public InstanceDatasetTemplateSpec getSpec() {
	return spec;
    }

    public void setSpec(InstanceDatasetTemplateSpec spec) {
	this.spec = spec;
    }

    public InstanceDatasetTemplateStatus getStatus() {
	return status;
    }

    public void setStatus(InstanceDatasetTemplateStatus status) {
	this.status = status;
    }
}
