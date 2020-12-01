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

import io.sitewhere.k8s.api.instance.IDockerSpec;

/**
 * Default {@link IDockerSpec} implementation.
 *
 */
public class DockerSpec implements IDockerSpec {

    /** Docker registry */
    private String registry;

    /** Docker repository */
    private String repository;

    /** Docker tag */
    private String tag;

    /*
     * (non-Javadoc)
     * 
     * @see io.sitewhere.k8s.api.instance.IDockerSpec#getRegistry()
     */
    @Override
    public String getRegistry() {
	return this.registry;
    }

    /*
     * (non-Javadoc)
     * 
     * @see io.sitewhere.k8s.api.instance.IDockerSpec#getRepository()
     */
    @Override
    public String getRepository() {
	return this.repository;
    }

    /*
     * (non-Javadoc)
     * 
     * @see io.sitewhere.k8s.api.instance.IDockerSpec#getTag()
     */
    @Override
    public String getTag() {
	return this.tag;
    }

    public void setRegistry(String registry) {
	this.registry = registry;
    }

    public void setRepository(String repository) {
	this.repository = repository;
    }

    public void setTag(String tag) {
	this.tag = tag;
    }

}
