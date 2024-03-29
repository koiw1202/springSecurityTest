//package com.example.ch16_02;
//
//import io.jsonwebtoken.security.Password;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
///**
// * description    :
// * ===========================================================
// * DATE              AUTHOR             NOTE
// * -----------------------------------------------------------
// * 2024-01-11        koiw1       최초 생성
// */
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class ProjectConfig {
//
//    @Bean
//    public UserDetailsService userDetailsService() {
//        var service = new InMemoryUserDetailsManager() ;
//
//        var u1 = User.withUsername("natalie")
//                .password("12345")
//                .authorities("read")
//                .build() ;
//
//        var u2 = User.withUsername("emma")
//                .password("12345")
//                .authorities("write")
//                .build() ;
//
//        service.createUser(u1);
//        service.createUser(u2);
//
//        return service ;
//
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return NoOpPasswordEncoder.getInstance() ;
//    }