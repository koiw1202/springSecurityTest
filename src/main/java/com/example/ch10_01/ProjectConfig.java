//package com.example.ch10_01;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.csrf.CsrfFilter;
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
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.addFilterAfter(new CsrfTokenLogger(), CsrfFilter.class)
//                .authorizeRequests().anyRequest().permitAll() ;
//    }
//
//}
