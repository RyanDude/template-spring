package com.example.demo.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class Config extends WebSecurityConfigurerAdapter {
    protected void configure(HttpSecurity http) throws Exception{
        // generate pass, it will be shown in the terminal, username = user.
        http.cors()
                .and()
                .csrf().disable();
        http.authorizeRequests().anyRequest().authenticated()
                .and()
                .formLogin()
                .successForwardUrl("/");
    }
}
