package com.mladra.keycloak;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ConfigurationProperties(prefix = "keycloak.server")
public class KeycloakServerProperties {
    
    String contextPath = "/auth";
    String realmImportFile = "game-web-realm.json";
    AdminUser adminUser = new AdminUser();

    @Getter
    @Setter
    public static class AdminUser {

        String username = "admin";
        String password = "admin";

    }
}
