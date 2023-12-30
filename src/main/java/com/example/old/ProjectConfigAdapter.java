//package com.example;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.core.userdetails.User;
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
// * 2023-12-28        koiw1       최초 생성
// */
//@Configuration
//public class ProjectConfigAdapter {
//
//    @Autowired
//    CustomAuthenticationProvider customAuthenticationProvider ;
//
//    @Bean
//    public UserDetailsService userDetailsService() {
//        var userDetailsService = new InMemoryUserDetailsManager() ;
//
//        var user = User.withUsername("john")
//                .password("12345")
//                .authorities("read")
//                .build() ;
//        userDetailsService.createUser(user);
//
//        return userDetailsService ;
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return NoOpPasswordEncoder.getInstance() ;
//    }
//
//
//}
