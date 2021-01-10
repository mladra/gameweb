package com.mladra.config;

// import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

// @Configuration FIXME: mladra: Configuration not working. Authorities are not read properly
public class JWTSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
        .authorizeRequests(authz -> authz
            .antMatchers(HttpMethod.GET, "/games/**").hasAuthority("SCOPE_read")
            .antMatchers(HttpMethod.POST, "/games").hasAuthority("SCOPE_write")
            .anyRequest().authenticated())
        .oauth2ResourceServer(oauth2 -> oauth2.jwt());
    }
}