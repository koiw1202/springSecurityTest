package com.example.ch10_03;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-08        koiw1       최초 생성
 */
@RestController
public class HelloController {

    @PostMapping("/hello")
    public String postHello() {
        return "Post Hello" ;
    }

    @PostMapping("/ciao")
    public String postCiao() {
        return "Post Ciao" ;
    }

}
