package com.spring.player.configuration;

import com.spring.player.model.Player;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

@Configuration
public class SpringConfiguration implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        HttpMethod [] preventMethods = {HttpMethod.GET, HttpMethod.POST, HttpMethod.DELETE, HttpMethod.PUT};
        config.getExposureConfiguration()
                .forDomainType(Player.class)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(preventMethods))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(preventMethods));
    }
}
