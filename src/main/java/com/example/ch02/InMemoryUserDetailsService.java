//package com.example;
//
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//import java.util.List;
//
///**
// * description    :
// * ===========================================================
// * DATE              AUTHOR             NOTE
// * -----------------------------------------------------------
// * 2023-12-30        koiw1       최초 생성
// */
//public class InMemoryUserDetailsService implements UserDetailsService {
//
//    private final List<UserDetails> users ;
//
//    public InMemoryUserDetailsService(List<UserDetails> users) {
//        this.users = users;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//
//        return users.stream()
//                .filter( u -> u.getUsername().equals(username))
//                .findFirst()
//                .orElseThrow(() -> new UsernameNotFoundException("User not found")) ;
//
//    }
//}