/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package io.sitewhere.k8s.crd.instance;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.sitewhere.k8s.api.instance.ISiteWhereInstanceSpec;

/**
 * SiteWhereInstance CRD specification.
 */
@JsonDeserialize(using = JsonDeserializer.None.class)
public class SiteWhereInstanceSpec implements KubernetesResource, ISiteWhereInstanceSpec {

    /** Serial version UID */
    private static final long serialVersionUID = -8588114929765353983L;

    /** Instance namespace */
    private String instanceNamespace;

    /** Instance configuration template name */
    private String configurationTemplate;

    /** Instance dataset template name */
    private String datasetTemplate;

    /** Global instance XML configuration */
    private JsonNode configuration;

    /*
     * @see
     * io.sitewhere.k8s.api.instance.ISiteWhereInstanceSpec#getInstanceNamespace()
     */
    @Override
    public String getInstanceNamespace() {
	return instanceNamespace;
    }

    public void setInstanceNamespace(String instanceNamespace) {
	this.instanceNamespace = instanceNamespace;
    }

    /*
     * @see
     * io.sitewhere.k8s.api.instance.ISiteWhereInstanceSpec#getConfigurationTemplate
     * ()
     */
    @Override
    public String getConfigurationTemplate() {
	return configurationTemplate;
    }

    public void setConfigurationTemplate(String configurationTemplate) {
	this.configurationTemplate = configurationTemplate;
    }

    /*
     * @see
     * io.sitewhere.k8s.api.instance.ISiteWhereInstanceSpec#getDatasetTemplate()
     */
    @Override
    public String getDatasetTemplate() {
	return datasetTemplate;
    }

    public void setDatasetTemplate(String datasetTemplate) {
	this.datasetTemplate = datasetTemplate;
    }

    /*
     * @see io.sitewhere.k8s.api.instance.ISiteWhereInstanceSpec#getConfiguration()
     */
    @Override
    public JsonNode getConfiguration() {
	return configuration;
    }

    public void setConfiguration(JsonNode configuration) {
	this.configuration = configuration;
    }
}
