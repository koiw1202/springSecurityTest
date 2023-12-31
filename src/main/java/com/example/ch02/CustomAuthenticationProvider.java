//package com.example;
//
//import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.stereotype.Component;
//
//import java.util.Arrays;
//
///**
// * description    :
// * ===========================================================
// * DATE              AUTHOR             NOTE
// * -----------------------------------------------------------
// * 2023-12-28        koiw1       최초 생성
// */
//@Component
//public class CustomAuthenticationProvider implements AuthenticationProvider {
//
//    @Override
//    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//        String username = authentication.getName() ;
//        String password = String.valueOf(authentication.getCredentials()) ;
//
//        if("john".equals(username) && "12345".equals(password))
//            return new UsernamePasswordAuthenticationToken(username, password, Arrays.asList()) ;
//        else
//            throw new AuthenticationCredentialsNotFoundException("Error !") ;
//    }
//
//    @Override
//    public boolean supports(Class<?> authentication) {
//        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication) ;
//    }
//
//}
