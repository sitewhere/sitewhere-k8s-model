/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.instance.configuration;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.fabric8.kubernetes.api.model.KubernetesResource;

/**
 * InstanceConfigurationTemplate CRD specification.
 */
@JsonDeserialize(using = JsonDeserializer.None.class)
public class InstanceConfigurationTemplateSpec implements KubernetesResource {

    /** Serial version UID */
    private static final long serialVersionUID = -3283412961517074958L;

    /** Instance configuration */
    private String instanceConfiguration;

    /** Web configuration */
    private String webConfiguration;

    public String getInstanceConfiguration() {
	return instanceConfiguration;
    }

    public void setInstanceConfiguration(String instanceConfiguration) {
	this.instanceConfiguration = instanceConfiguration;
    }

    public String getWebConfiguration() {
	return webConfiguration;
    }

    public void setWebConfiguration(String webConfiguration) {
	this.webConfiguration = webConfiguration;
    }
}
