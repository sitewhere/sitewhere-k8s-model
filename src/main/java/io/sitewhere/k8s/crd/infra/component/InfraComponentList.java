/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.infra.component;

import io.fabric8.kubernetes.client.CustomResourceList;

public class InfraComponentList extends CustomResourceList<InfraComponent> {

    /** Serial version UID */
    private static final long serialVersionUID = 5472185638399471558L;
}
