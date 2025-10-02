package com.example.meuProjetoJavaAngular.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // desativa CSRF, necessário para POST via Postman
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll() // libera todas as requisições sem autenticação
                );

        return http.build();
    }
}