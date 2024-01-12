//package com.example.ch11_02.authentication.filters;
//
//import com.example.ch11_02.authentication.UsernamePasswordAuthentication;
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//import io.jsonwebtoken.security.Keys;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.json.BasicJsonParser;
//import org.springframework.boot.json.JsonParser;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import javax.crypto.SecretKey;
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.nio.charset.StandardCharsets;
//import java.sql.Timestamp;
//import java.time.LocalDateTime;
//import java.util.Base64;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@Component
//public class JwtAuthenticationFilter extends OncePerRequestFilter {
//
//    @Value("${jwt.signing.key}")
//    private String signingKey;
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//        // 타입은 JWT  // 서명 알고리즘 유형
//        Map<String, Object> headers = new HashMap<>() ;
//        headers.put("type", "JWT") ;
//        headers.put("alg", "HS256") ;
//
//        SecretKey key = Keys.hmacShaKeyFor(signingKey.getBytes(StandardCharsets.UTF_8));
//
//        LocalDateTime date = LocalDateTime.now().plusDays(1L) ;
//
//        Map<String, Object> map = getPayLoadToMap(request.getHeader("Authorization2")) ;
//
//        String username = String.valueOf(map.get("username"));
//
//        GrantedAuthority a = new SimpleGrantedAuthority("user");
//        var auth = new UsernamePasswordAuthentication(username, null, List.of(a));
//        SecurityContextHolder.getContext().setAuthentication(auth);
//
//        filterChain.doFilter(request, response);
//    }
//
//    public Map<String, Object> getPayLoadToMap(String token) {
//
//        final String payloadJWT = token.split("\\.")[1];
//        Base64.Decoder decoder = Base64.getUrlDecoder();
//
//        final String payload = new String(decoder.decode(payloadJWT)) ;
//        JsonParser jsonParser = new BasicJsonParser() ;
//        Map<String, Object> jsonArray = jsonParser.parseMap(payload) ;
//
//        return jsonArray ;
//    }
//
//    @Override
//    protected boolean shouldNotFilter(HttpServletRequest request) {
//        return request.getServletPath().equals("/login");
//    }
//}
