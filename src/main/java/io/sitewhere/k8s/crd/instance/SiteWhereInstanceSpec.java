/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.instance;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.fabric8.kubernetes.api.model.KubernetesResource;

/**
 * SiteWhereInstance CRD specification.
 */
@JsonDeserialize(using = JsonDeserializer.None.class)
public class SiteWhereInstanceSpec implements KubernetesResource {

    /** Serial version UID */
    private static final long serialVersionUID = -8588114929765353983L;
}
