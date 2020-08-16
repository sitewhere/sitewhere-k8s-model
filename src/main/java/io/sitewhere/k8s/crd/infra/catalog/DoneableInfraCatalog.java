/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.infra.catalog;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.client.CustomResourceDoneable;

public class DoneableInfraCatalog extends CustomResourceDoneable<InfraCatalog> {

    public DoneableInfraCatalog(InfraCatalog resource, Function<InfraCatalog, InfraCatalog> function) {
	super(resource, function);
    }
}
