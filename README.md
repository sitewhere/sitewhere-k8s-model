# SiteWhere Kubernetes Model

The SiteWhere Kubernetes resource model contains Java entities which correspond
to k8s [custom resource definitions](https://kubernetes.io/docs/concepts/extend-kubernetes/api-extension/custom-resources/).
The following resources are included in the SiteWhere Kubernetes resource model. Resources are scoped at either the global
instance level or at the tenant level.

## Instance Global Resources

### `SiteWhereInstance`
Delares a SiteWhere instance which creates name and namespace for other
resources to be attached to.

### `InstanceConfigurationTemplate`
Specifies global configuration options which may be used when creating 
a new instance. A `SiteWhereInstance` references a instance configuration
template by name in order to bootstrap the configuration.

### `InstanceConfiguration`
Specifies the global configuration used by an `SiteWhereInstance`. When an
instance resource is created, it references an `InstanceConfigurationTemplate`
which is used to populate the initial configuration.

### `InstanceDatasetTemplate`
Specifies a set of scripts which are executed to populate instance data
such as an intial list of tenants and users.

### `SiteWhereMicroservice`
Configures a microservice which is associated with a `SiteWhereInstance`.

## Tenant Resources

### `SiteWhereTenant`
Creates a tenant associated with a `SiteWhereInstance`. Each tenant has tenant 
engines which run within a `SiteWhereMicroservice`.

### `SiteWhereTenantEngine`
Specifies the configuration and other details for a single tenant engine 
(microservice + tenant combination). When a new tenant is initially added, the 
tenant engine configuration is copied based on the `TenantEngineConfigurationTemplate` 
associated with the tenant.

### `TenantConfigurationTemplate`
Gathers a list of `TenantEngineConfigurationTemplate` that will be used for a given
tenant configuration.

### `TenantEngineConfigurationTemplate`
Specifies a tenant-level configuration options which are used to set the
initial configuration for the tenant engines running within the microservices.

### `TenantEngineDatasetTemplate`
Specifies a set of scripts which are used to populate initial data an individual
microservice. For instance, tenant dataset templates may be used to create device
types, devices, customers, areas, etc in order to pre-populate tenants with data.

