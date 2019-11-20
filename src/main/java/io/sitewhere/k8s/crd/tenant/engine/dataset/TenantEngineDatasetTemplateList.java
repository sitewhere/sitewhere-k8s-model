/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.tenant.engine.dataset;

import io.fabric8.kubernetes.client.CustomResourceList;
import io.sitewhere.k8s.crd.tenant.engine.SiteWhereTenantEngine;

public class TenantEngineDatasetTemplateList extends CustomResourceList<SiteWhereTenantEngine> {

    /** Serial version UID */
    private static final long serialVersionUID = -8256145107326549137L;
}