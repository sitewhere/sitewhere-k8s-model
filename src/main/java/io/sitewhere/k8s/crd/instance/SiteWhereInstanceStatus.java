/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.instance;

import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.sitewhere.k8s.crd.common.BootstrapState;

/**
 * SiteWhereInstance CRD status.
 */
public class SiteWhereInstanceStatus implements KubernetesResource {

    /** Serial version UID */
    private static final long serialVersionUID = 849148365787926189L;

    /** Indicates if tenant management has been bootstrapped */
    private BootstrapState tenantManagementBootstrapState = BootstrapState.NotBootstrapped;

    /** Indicates if user management has been bootstrapped */
    private BootstrapState userManagementBootstrapState = BootstrapState.NotBootstrapped;

    public BootstrapState getTenantManagementBootstrapState() {
	return tenantManagementBootstrapState;
    }

    public void setTenantManagementBootstrapState(BootstrapState tenantManagementBootstrapState) {
	this.tenantManagementBootstrapState = tenantManagementBootstrapState;
    }

    public BootstrapState getUserManagementBootstrapState() {
	return userManagementBootstrapState;
    }

    public void setUserManagementBootstrapState(BootstrapState userManagementBootstrapState) {
	this.userManagementBootstrapState = userManagementBootstrapState;
    }
}
