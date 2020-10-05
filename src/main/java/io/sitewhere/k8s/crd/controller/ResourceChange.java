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
package io.sitewhere.k8s.crd.controller;

public class ResourceChange<T> {

    /** Type of change */
    private ResourceChangeType type;

    /** Key */
    private String key;

    /** Resource reference */
    private T reference;

    public ResourceChange(ResourceChangeType type, String key, T reference) {
	this.type = type;
	this.key = key;
	this.reference = reference;
    }

    public ResourceChangeType getType() {
	return type;
    }

    public void setType(ResourceChangeType type) {
	this.type = type;
    }

    public String getKey() {
	return key;
    }

    public void setKey(String key) {
	this.key = key;
    }

    public T getReference() {
	return reference;
    }

    public void setReference(T reference) {
	this.reference = reference;
    }
}
