//package com.example.ch10_02;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.provisioning.UserDetailsManager;
//
///**
// * description    :
// * ===========================================================
// * DATE              AUTHOR             NOTE
// * -----------------------------------------------------------
// * 2024-01-08        koiw1       최초 생성
// */
//@Configuration
//public class ProjectConfig extends WebSecurityConfigurerAdapter {
//
//    @Bean
//    public UserDetailsManager userDetailsManager() {
//        UserDetailsManager uds = new InMemoryUserDetailsManager() ;
//
//        var u1 = User.builder().username("mary")
//                .password("12345")
//                .authorities("READ")
//                .build() ;
//
//        uds.createUser(u1) ;
//        return uds ;
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return NoOpPasswordEncoder.getInstance() ;
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .anyRequest().authenticated() ;
//
//        http.formLogin()
//                .defaultSuccessUrl("/main", true) ;
//    }
//}
