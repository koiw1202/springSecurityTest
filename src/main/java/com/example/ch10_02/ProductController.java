//package com.example.ch10_02;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.logging.Logger;
//
///**
// * description    :
// * ===========================================================
// * DATE              AUTHOR             NOTE
// * -----------------------------------------------------------
// * 2024-01-08        koiw1       최초 생성
// */
//@Controller
//@RequestMapping("/product")
//public class ProductController {
//
//    private Logger logger = Logger.getLogger(ProductController.class.getName()) ;
//
//    @PostMapping("/add")
//    public String add(@RequestParam String name) {
//        logger.info("Adding product " + name);
//        return "main.html" ;
//    }
//
//
//
//}
