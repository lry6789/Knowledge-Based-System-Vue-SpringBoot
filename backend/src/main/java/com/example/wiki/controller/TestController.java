package com.example.wiki.controller;

import com.example.wiki.domain.Test;
import com.example.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

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
    @Resource
    private TestService testService;
    @RequestMapping("/hello")
    public String hello(){
        return "hello world"+testHello;
    }
    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "hello world! Post."+name ;
    }

    @GetMapping("test/list")
    public List<Test> list(){
        return testService.list();
    }
}
