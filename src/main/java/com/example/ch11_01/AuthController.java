//package com.example.ch11_01;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.servlet.http.HttpServletResponse;
//
///**
// * description    :
// * ===========================================================
// * DATE              AUTHOR             NOTE
// * -----------------------------------------------------------
// * 2024-01-09        koiw1       최초 생성
// */
//@RestController
//public class AuthController {
//
//    @Autowired
//    UserService userService ;
//
//    @PostMapping("/user/add")
//    public void addUser(@RequestBody User user) {
//        userService.addUser(user) ;
//    }
//
//    @PostMapping("/user/auth")
//    public void auth(@RequestBody User user) {
//        userService.auth(user) ;
//    }
//
//    @PostMapping("/otp/check")
//    public void check(@RequestBody Otp otp, HttpServletResponse response) {
//        if(userService.check(otp)) {
//            response.setStatus(HttpServletResponse.SC_OK) ;
//        } else {
//            response.setStatus(HttpServletResponse.SC_FORBIDDEN);
//        }
//    }
//
//
//
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
//
//
//
//
//
