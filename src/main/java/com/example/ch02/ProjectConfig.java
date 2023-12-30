//package com.example;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//import java.util.List;
//
///**
// * description    :
// * ===========================================================
// * DATE              AUTHOR             NOTE
// * -----------------------------------------------------------
// * 2023-12-28        koiw1       최초 생성
// */
//@Configuration
//public class ProjectConfig {
//
//    @Bean
//    public UserDetailsService userDetailsService() {
//        UserDetails u = new User("john", "12345", "read") ;
//        List<UserDetails> users = List.of(u) ;
//
//        return new InMemoryUserDetailsService(users) ;
//
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return NoOpPasswordEncoder.getInstance() ;
//    }
//
//
//}
