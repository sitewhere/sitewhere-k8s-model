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
package io.sitewhere.k8s.crd.tenant.scripting.version;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.fabric8.kubernetes.api.model.KubernetesResource;

/**
 * SiteWhereScriptVersion CRD specification.
 */
@JsonDeserialize(using = JsonDeserializer.None.class)
public class SiteWhereScriptVersionSpec implements KubernetesResource {

    /** Serial version UID */
    private static final long serialVersionUID = 4418530241331241674L;

    /** Comment */
    private String comment;

    /** Script content */
    private String content;

    public String getComment() {
	return comment;
    }

    public void setComment(String comment) {
	this.comment = comment;
    }

    public String getContent() {
	return content;
    }

    public void setContent(String content) {
	this.content = content;
    }
}
