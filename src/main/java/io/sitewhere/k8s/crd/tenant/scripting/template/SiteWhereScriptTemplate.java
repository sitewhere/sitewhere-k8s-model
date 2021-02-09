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
package io.sitewhere.k8s.crd.tenant.scripting.template;

import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.client.CustomResource;

/**
 * SiteWhereScriptTemplate CRD.
 */
public class SiteWhereScriptTemplate extends CustomResource {

    /** Serial version UID */
    private static final long serialVersionUID = 4752770422639753964L;

    /** Script specification */
    private SiteWhereScriptTemplateSpec spec = new SiteWhereScriptTemplateSpec();

    /** Script status */
    private SiteWhereScriptTemplateStatus status = new SiteWhereScriptTemplateStatus();

    /*
     * @see io.fabric8.kubernetes.client.CustomResource#getMetadata()
     */
    @Override
    public ObjectMeta getMetadata() {
	return super.getMetadata();
    }

    public SiteWhereScriptTemplateSpec getSpec() {
	return spec;
    }

    public void setSpec(SiteWhereScriptTemplateSpec spec) {
	this.spec = spec;
    }

    public SiteWhereScriptTemplateStatus getStatus() {
	return status;
    }

    public void setStatus(SiteWhereScriptTemplateStatus status) {
	this.status = status;
    }
}
