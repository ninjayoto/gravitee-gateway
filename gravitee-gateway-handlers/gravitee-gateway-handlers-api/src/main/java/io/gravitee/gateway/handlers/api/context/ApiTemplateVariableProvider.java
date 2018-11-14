package io.gravitee.gateway.handlers.api.context;

import io.gravitee.gateway.api.expression.TemplateContext;
import io.gravitee.gateway.api.expression.TemplateVariableProvider;
import io.gravitee.gateway.handlers.api.definition.Api;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

/**
 * @author David BRASSELY (david.brassely at graviteesource.com)
 * @author GraviteeSource Team
 */
public class ApiTemplateVariableProvider implements TemplateVariableProvider {

    @Autowired
    private Api api;

    private ApiProperties apiProperties;

    @PostConstruct
    public void afterPropertiesSet() {
        apiProperties = new ApiProperties(api);
    }
    @Override
    public void provide(TemplateContext templateContext) {
        // Keep this variable for backward compatibility
        templateContext.setVariable("properties", api.properties());

        templateContext.setVariable("api", apiProperties);
    }
}
