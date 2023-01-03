package com.example.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    /*
    * GET POST PUT DELETE
    * RequestMapping: available for all the kinds of request above
    * GetMapping: only available for Get
    * PostMapping
    * PutMapping
    * DeleteMapping
    *
    * @RequestMapping(value = "/hello",method = RequestMethod.GET)
    *
    * /user/1
    * */
    @Value("${test.hello:Hi2}")
    private String testHello;
    @RequestMapping("/hello")
    public String hello(){
        return "hello world"+testHello;
    }
    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "hello world! Post."+name ;
    }
}
