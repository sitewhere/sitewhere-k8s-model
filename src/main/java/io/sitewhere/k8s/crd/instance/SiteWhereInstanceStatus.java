/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.instance;

import io.fabric8.kubernetes.api.model.KubernetesResource;

/**
 * SiteWhereInstance CRD status.
 */
public class SiteWhereInstanceStatus implements KubernetesResource {

    /** Serial version UID */
    private static final long serialVersionUID = 849148365787926189L;

    /** Indicates if an instance configuration has been set */
    private boolean instanceConfigured = false;

    public boolean isInstanceConfigured() {
	return instanceConfigured;
    }

    public void setInstanceConfigured(boolean instanceConfigured) {
	this.instanceConfigured = instanceConfigured;
    }
}
