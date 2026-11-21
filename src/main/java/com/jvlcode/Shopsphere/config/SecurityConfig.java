package com.jvlcode.Shopsphere.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests(auth -> auth
                .requestMatchers(HttpMethod.GET ,"/api/products/**").permitAll()
                .requestMatchers("/api/auth/**").permitAll()
                        .requestMatchers("/api/admin/**").hasRole("ADMIN")
                .requestMatchers( "/v3/api-docs/**",
                        "/swagger-ui/**",
                        "/swagger-ui.html").permitAll()
                .anyRequest().authenticated()
        )
                .httpBasic(Customizer.withDefaults());
        return http.build();
    }
}
