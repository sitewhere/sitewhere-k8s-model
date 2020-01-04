/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.tenant.engine;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.sitewhere.k8s.crd.common.BootstrapState;

/**
 * SiteWhereTenantEngine CRD status.
 */
@JsonDeserialize(using = JsonDeserializer.None.class)
public class SiteWhereTenantEngineStatus implements KubernetesResource {

    /** Serial version UID */
    private static final long serialVersionUID = 2812411676466723825L;

    /** Indicates if an instance has been bootstrapped */
    private BootstrapState bootstrapState = BootstrapState.NotBootstrapped;

    public BootstrapState getBootstrapState() {
	return bootstrapState;
    }

    public void setBootstrapState(BootstrapState bootstrapState) {
	this.bootstrapState = bootstrapState;
    }
}
