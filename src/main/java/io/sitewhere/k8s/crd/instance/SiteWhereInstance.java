/**
 * Copyright © 2014-2020 The SiteWhere Authors
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
package io.sitewhere.k8s.crd.instance;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.client.CustomResource;

/**
 * SiteWhereInstance CRD.
 */
@JsonInclude(Include.NON_NULL)
public class SiteWhereInstance extends CustomResource {

    /** Serial version UID */
    private static final long serialVersionUID = 9047754703679419557L;

    /** Instance specification */
    private SiteWhereInstanceSpec spec = new SiteWhereInstanceSpec();

    /** Instance status */
    private SiteWhereInstanceStatus status = new SiteWhereInstanceStatus();

    /*
     * @see io.fabric8.kubernetes.client.CustomResource#getMetadata()
     */
    @Override
    public ObjectMeta getMetadata() {
	return super.getMetadata();
    }

    public SiteWhereInstanceSpec getSpec() {
	return spec;
    }

    public void setSpec(SiteWhereInstanceSpec spec) {
	this.spec = spec;
    }

    public SiteWhereInstanceStatus getStatus() {
	return status;
    }

    public void setStatus(SiteWhereInstanceStatus status) {
	this.status = status;
    }
}
