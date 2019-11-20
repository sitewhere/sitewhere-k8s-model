/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.tenant.engine.configuration;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.client.CustomResourceDoneable;

public class DoneableTenantEngineConfigurationTemplate
	extends CustomResourceDoneable<TenantEngineConfigurationTemplate> {

    public DoneableTenantEngineConfigurationTemplate(TenantEngineConfigurationTemplate resource,
	    Function<TenantEngineConfigurationTemplate, TenantEngineConfigurationTemplate> function) {
	super(resource, function);
    }
}