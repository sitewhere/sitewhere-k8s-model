/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.infra.configuration;

import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.client.CustomResource;

/**
 * InfraConfiguration CRD.
 */
public class InfraConfiguration extends CustomResource {

    /** Serial version UID */
    private static final long serialVersionUID = 3050092180657738611L;

    /** Specification */
    private InfraConfigurationSpec spec = new InfraConfigurationSpec();

    /** Status */
    private InfraConfigurationStatus status = new InfraConfigurationStatus();

    /*
     * @see io.fabric8.kubernetes.client.CustomResource#getMetadata()
     */
    @Override
    public ObjectMeta getMetadata() {
	return super.getMetadata();
    }

    public InfraConfigurationSpec getSpec() {
	return spec;
    }

    public void setSpec(InfraConfigurationSpec spec) {
	this.spec = spec;
    }

    public InfraConfigurationStatus getStatus() {
	return status;
    }

    public void setStatus(InfraConfigurationStatus status) {
	this.status = status;
    }
}
