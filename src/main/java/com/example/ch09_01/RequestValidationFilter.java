//package com.example.ch09_01;
//
//import javax.servlet.*;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * description    :
// * ===========================================================
// * DATE              AUTHOR             NOTE
// * -----------------------------------------------------------
// * 2024-01-07        koiw1       최초 생성
// */
//public class RequestValidationFilter implements Filter {
//
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//
//        var httpRequest = (HttpServletRequest) request ;
//        var httpResponse = (HttpServletResponse) response ;
//
//        String requestId = httpRequest.getHeader("Request-Id") ;
//
//        if(requestId == null || requestId.isBlank()){
//            httpResponse.setStatus(HttpServletResponse.SC_BAD_REQUEST);
//            return ;
//        }
//
//        chain.doFilter(request, response) ;
//    }
//
//}
