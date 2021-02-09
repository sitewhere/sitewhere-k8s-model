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
package io.sitewhere.k8s.crd;

public class ResourceLabels {

    /** Label for SiteWhere instance name */
    public static final String LABEL_SITEWHERE_NAME = "sitewhere.io/name";

    /** Label for SiteWhere role name */
    public static final String LABEL_SITEWHERE_ROLE = "sitewhere.io/role";

    /** Label for SiteWhere instance name */
    public static final String LABEL_SITEWHERE_INSTANCE = "sitewhere.io/instance";

    /** Label for SiteWhere tenant name */
    public static final String LABEL_SITEWHERE_TENANT = "sitewhere.io/tenant";

    /** Label for SiteWhere microservice name */
    public static final String LABEL_SITEWHERE_MICROSERVICE = "sitewhere.io/microservice";

    /** Label for SiteWhere functional area name */
    public static final String LABEL_SITEWHERE_FUNCTIONAL_AREA = "sitewhere.io/functional-area";

    /** Label for script identifier */
    public static final String LABEL_SCRIPTING_SCRIPT_ID = "scripting.sitewhere.io/script-id";

    /** Label for script category */
    public static final String LABEL_SCRIPTING_SCRIPT_CATEGORY = "scripting.sitewhere.io/category";

    /** Label for Kubernetes name */
    public static final String LABEL_K8S_NAME = "app.kubernetes.io/name";

    /** Label for Kubernetes instance */
    public static final String LABEL_K8S_INSTANCE = "app.kubernetes.io/instance";

    /** Label for Kubernetes managed by */
    public static final String LABEL_K8S_MANAGED_BY = "app.kubernetes.io/managed-by";

    /** Label for Helm chart name */
    public static final String LABEL_HELM_CHART = "helm.sh/chart";
}
