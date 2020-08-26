/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.api.instance;

import com.fasterxml.jackson.databind.JsonNode;

public interface ISiteWhereInstanceSpec {

    /**
     * Instance namespace
     */
    String getInstanceNamespace();

    /**
     * Instance configuration template name
     */
    String getConfigurationTemplate();

    /**
     * Instance dataset template name
     */
    String getDatasetTemplate();

    /**
     * Global instance XML configuration
     */
    JsonNode getConfiguration();
}
