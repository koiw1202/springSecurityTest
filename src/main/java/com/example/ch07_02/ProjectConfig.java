//package com.example.ch07_02;//package com.example.ch07_01;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
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
// * 2024-01-04        koiw1       최초 생성
// */
//@Configuration
//public class ProjectConfig extends WebSecurityConfigurerAdapter {
//
//    @Bean
//    public UserDetailsService userDetailsService() {
//        var manager = new InMemoryUserDetailsManager() ;
//
//        var user1 = User.withUsername("john")
//                .password("12345")
//                .authorities("ROLE_ADMIN")
//                .build() ;
//
//        var user2 = User.withUsername("jane")
//                .password("12345")
//                .authorities("ROLE_MANAGER")
//                .build() ;
//
//        manager.createUser(user1);
//        manager.createUser(user2);
//
//        return manager ;
//
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return NoOpPasswordEncoder.getInstance() ;
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.httpBasic() ;
//
//        http.authorizeRequests()
//                .mvcMatchers("/hello/**").hasRole("ADMIN")
//                .mvcMatchers("/ciao/**").hasRole("MANAGER")
//                .anyRequest().authenticated() ;
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
