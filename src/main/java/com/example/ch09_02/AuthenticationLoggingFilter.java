//package com.example.ch09_02;
//
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
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
//public class AuthenticationLoggingFilter extends OncePerRequestFilter {
//
//    private final Logger logger = Logger.getLogger(AuthenticationLoggingFilter.class.getName()) ;
//
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//        String requestId = request.getHeader("Reqeust-id") ;
//        logger.info("Successfully authenticated reqeust with id " + requestId) ;
//
//        filterChain.doFilter(request,response) ;
//
//    }
//}
