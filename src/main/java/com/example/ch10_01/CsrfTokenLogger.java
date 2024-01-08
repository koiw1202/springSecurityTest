//package com.example.ch10_01;
//
//import org.springframework.security.web.csrf.CsrfToken;
//
//import javax.servlet.*;
//import java.io.IOException;
//import java.util.logging.LogRecord;
//import java.util.logging.Logger;
//
///**
// * description    :
// * ===========================================================
// * DATE              AUTHOR             NOTE
// * -----------------------------------------------------------
// * 2024-01-08        koiw1       최초 생성
// */
//public class CsrfTokenLogger implements Filter {
//
//    private Logger logger = Logger.getLogger(CsrfTokenLogger.class.getName()) ;
//
//
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//
//        Object o = request.getAttribute("_csrf") ;
//        CsrfToken token = (CsrfToken) o ;
//
//        logger.info("CSRF token " + token.getToken());
//        chain.doFilter(request,response) ;
//
//    }
//}
