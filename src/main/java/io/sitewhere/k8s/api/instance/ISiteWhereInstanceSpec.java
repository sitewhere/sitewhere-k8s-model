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
package io.sitewhere.k8s.api.instance;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;

import io.sitewhere.k8s.api.microservice.ISiteWhereMicroserviceSpec;

public interface ISiteWhereInstanceSpec {

    /**
     * Get name displayed for instance.
     * 
     * @return
     */
    String getName();

    /**
     * Get description displayed for instance.
     * 
     * @return
     */
    String getDescription();

    /**
     * Intance Docker Spec
     * 
     * @return
     */
    IDockerSpec getDockerSpec();

    /**
     * Instance configuration template name
     * 
     * @return
     */
    String getConfigurationTemplate();

    /**
     * Instance dataset template name
     * 
     * @return
     */
    String getDatasetTemplate();

    /**
     * Global instance XML configuration
     * 
     * @return
     */
    JsonNode getConfiguration();

    /**
     * Get list of microservice specs.
     * 
     * @return
     */
    List<? extends ISiteWhereMicroserviceSpec> getMicroservices();
}
