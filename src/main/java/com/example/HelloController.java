package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-12-28        koiw1       최초 생성
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello" ;
    }


}
