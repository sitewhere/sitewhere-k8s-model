/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.common;

/**
 * State values for bootstrapping a component.
 */
public enum BootstrapState {
    /** Component not bootstrapped */
    NotBootstrapped,

    /** Component in process of bootstrapping */
    Bootstrapping,

    /** Component bootstrapped */
    Bootstrapped,

    /** Bootstrap attempted but failed */
    BootstrapFailed;
}
