package com.footballstandings.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests((requests) -> requests.anyRequest().permitAll());
        http.requiresChannel(channel ->
                        channel.anyRequest().requiresSecure() // Force HTTPS
                );
        http.formLogin(withDefaults());
        http.httpBasic(withDefaults());

        return http.build();
    }
}
