//package com.example.ch08_01;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * description    :
// * ===========================================================
// * DATE              AUTHOR             NOTE
// * -----------------------------------------------------------
// * 2024-01-07        koiw1       최초 생성
// */
//@RestController
//public class TestController {
//
//    @GetMapping("/video/{country}/{language}")
//    public String video(@PathVariable String country,
//                        @PathVariable String language) {
//
//        return "Video allowed for " + country + " " + language ;
//    }
//
//}