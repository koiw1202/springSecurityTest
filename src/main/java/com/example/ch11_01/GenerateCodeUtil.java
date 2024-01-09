//package com.example.ch11_01;
//
//import java.security.NoSuchAlgorithmException;
//import java.security.SecureRandom;
//
///**
// * description    :
// * ===========================================================
// * DATE              AUTHOR             NOTE
// * -----------------------------------------------------------
// * 2024-01-09        koiw1       최초 생성
// */
//public class GenerateCodeUtil {
//
//    private GenerateCodeUtil() {
//
//    }
//
//    public static String generateCode() {
//        String code ;
//
//        try {
//            SecureRandom random = SecureRandom.getInstanceStrong() ;
//
//            int c = random.nextInt(9000) + 1000 ;
//
//            code = String.valueOf(c) ;
//
//        } catch (NoSuchAlgorithmException e) {
//            throw new RuntimeException(e);
//        }
//
//        return code ;
//
//    }
//
//}
