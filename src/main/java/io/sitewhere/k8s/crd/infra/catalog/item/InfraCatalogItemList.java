/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.infra.catalog.item;

import io.fabric8.kubernetes.client.CustomResourceList;

public class InfraCatalogItemList extends CustomResourceList<InfraCatalogItem> {

    /** Serial version UID */
    private static final long serialVersionUID = 1164989389476339916L;
}
