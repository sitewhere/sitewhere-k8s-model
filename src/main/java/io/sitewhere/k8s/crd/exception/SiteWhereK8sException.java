/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.exception;

/**
 * General exception thrown by client calls.
 */
public class SiteWhereK8sException extends Exception {

    /** Serial version UID */
    private static final long serialVersionUID = -2302717601208081651L;

    public SiteWhereK8sException() {
    }

    public SiteWhereK8sException(String arg0) {
	super(arg0);
    }

    public SiteWhereK8sException(Throwable arg0) {
	super(arg0);
    }

    public SiteWhereK8sException(String arg0, Throwable arg1) {
	super(arg0, arg1);
    }

    public SiteWhereK8sException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
	super(arg0, arg1, arg2, arg3);
    }
}
