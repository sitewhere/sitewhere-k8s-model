/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.microservice;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.client.CustomResourceDoneable;

public class DoneableSiteWhereMicroservice extends CustomResourceDoneable<SiteWhereMicroservice> {

    public DoneableSiteWhereMicroservice(SiteWhereMicroservice resource,
	    Function<SiteWhereMicroservice, SiteWhereMicroservice> function) {
	super(resource, function);
    }
}
