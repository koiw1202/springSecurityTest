//package com.example.ch09_01;
//
//import javax.servlet.*;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.logging.Logger;
//
///**
// * description    :
// * ===========================================================
// * DATE              AUTHOR             NOTE
// * -----------------------------------------------------------
// * 2024-01-07        koiw1       최초 생성
// */
//
//public class AuthenticationLoggingFilter implements Filter {
//
//    private final Logger logger = Logger.getLogger(AuthenticationLoggingFilter.class.getName()) ;
//
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        var httpRequest = (HttpServletRequest) request ;
//        var requestId = httpRequest.getHeader("Request-id") ;
//
//        logger.info("Successfully authenticated request with id " + requestId) ;
//
//        chain.doFilter(request, response) ;
//
//
//    }
//
//}
