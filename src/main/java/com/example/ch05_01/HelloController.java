//package com.example.ch05_01;
//
//import org.springframework.scheduling.annotation.Async;
//import org.springframework.security.core.Authentication;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.concurrent.Callable;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//@RestController
//public class HelloController {
//
//    @GetMapping("/hello")
//    public String hello(Authentication a) {
//
//        System.out.println(a.getName());
//        System.out.println(a.getCredentials());
//        System.out.println(a.getDetails());
//        System.out.println(a.getPrincipal());
//
//        a.getAuthorities().stream().forEach(value -> {
//            System.out.println(value.getAuthority());
//        });
//
//        return "Hello, " + a.getName() + "!" ;
//    }
//
//    @GetMapping("/hello2")
//    @Async
//    public String hello2(Authentication a) {
//
//        System.out.println(a.getName());
//        System.out.println(a.getCredentials());
//        System.out.println(a.getDetails());
//        System.out.println(a.getPrincipal());
//
//        a.getAuthorities().stream().forEach(value -> {
//            System.out.println(value.getAuthority());
//        });
//
//        return "Hello, " + a.getName() + "!" ;
//    }
//
//    @GetMapping("/ciao")
//    public String ciao(final Authentication a) throws Exception {
//
//        Callable<String> task = () -> a.getName() ;
//
//        ExecutorService e = Executors.newCachedThreadPool() ;
//
//        try{
//            return "Ciao, " + e.submit(task).get() + "!" ;
//        }finally {
//            e.shutdown();
//        }
//    }
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
