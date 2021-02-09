/**
 * Copyright © 2014-2021 The SiteWhere Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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
