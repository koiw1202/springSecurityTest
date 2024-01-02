//package com.example.ch03;
//
//import org.springframework.security.crypto.password.PasswordEncoder;
//
///**
// * description    :
// * ===========================================================
// * DATE              AUTHOR             NOTE
// * -----------------------------------------------------------
// * 2023-12-30        koiw1       최초 생성
// */
//public class PlainTextPasswordEncoder implements PasswordEncoder {
//
//    @Override
//    public String encode(CharSequence rawPassword) {
//        return rawPassword.toString() ;
//    }
//
//    @Override
//    public boolean matches(CharSequence rawPassword, String encodedPassword) {
//        return rawPassword.equals(encodedPassword);
//    }
//}
