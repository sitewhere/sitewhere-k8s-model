/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.instance.configuration;

import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.client.CustomResource;

/**
 * InstanceConfigurationTemplate CRD.
 */
public class InstanceConfigurationTemplate extends CustomResource {

    /** Serial version UID */
    private static final long serialVersionUID = -530278083134881294L;

    /** Specification */
    private InstanceConfigurationTemplateSpec spec;

    /** Status */
    private InstanceConfigurationTemplateStatus status;

    /*
     * @see io.fabric8.kubernetes.client.CustomResource#getMetadata()
     */
    @Override
    public ObjectMeta getMetadata() {
	return super.getMetadata();
    }

    public InstanceConfigurationTemplateSpec getSpec() {
	return spec;
    }

    public void setSpec(InstanceConfigurationTemplateSpec spec) {
	this.spec = spec;
    }

    public InstanceConfigurationTemplateStatus getStatus() {
	return status;
    }

    public void setStatus(InstanceConfigurationTemplateStatus status) {
	this.status = status;
    }
}
