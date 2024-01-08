//package com.example.ch09_01;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.*;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.Enumeration;
//
///**
// * description    :
// * ===========================================================
// * DATE              AUTHOR             NOTE
// * -----------------------------------------------------------
// * 2024-01-07        koiw1       최초 생성
// */
//@Component
//public class StaticKeyAuthenticationFilter implements Filter {
//
//    @Value("${authorization.key}")
//    private String authorizationKey ;
//
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        var httpRequest = (HttpServletRequest) request ;
//        var httpResponse = (HttpServletResponse) response ;
//
//        String authorization = httpRequest.getHeader("authorization1") ;
//
//        System.out.println("authorization : " + authorization) ;
//
//        if(authorizationKey.equals(authorization)) {
//            chain.doFilter(request,response);
//        } else {
//            httpResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED) ;
//        }
//    }
//
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
//
//
