package com.example.ch17_01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-12        koiw1       최초 생성
 */
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ProductConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public UserDetailsService userDetailsService() {
        var manager = new InMemoryUserDetailsManager() ;

        var u1 = User.withUsername("nikolai")
                .password("12345")
                .authorities("READ")
                .build() ;

        var u2 = User.withUsername("julien")
                .password("12345")
                .authorities("READ")
                .build() ;

        manager.createUser(u1);
        manager.createUser(u2);

        return manager ;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance() ;
    }

}








