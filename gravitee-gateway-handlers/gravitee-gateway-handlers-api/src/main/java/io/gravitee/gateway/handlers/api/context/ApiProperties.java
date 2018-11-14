package io.gravitee.gateway.handlers.api.context;

import io.gravitee.gateway.handlers.api.definition.Api;

/**
 * @author David BRASSELY (david.brassely at graviteesource.com)
 * @author GraviteeSource Team
 */
class ApiProperties {

    private final Api api;

    ApiProperties(final Api api) {
        this.api = api;
    }

    public String getId() {
        return this.api.getId();
    }

    public String getName() {
        return this.api.getName();
    }

    public String getVersion() {
        return this.api.getVersion();
    }

    public io.gravitee.definition.model.Properties getProperties() {
        return this.api.getProperties();
    }
}
