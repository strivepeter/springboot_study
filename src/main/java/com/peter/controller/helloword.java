package com.peter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/3/19.
 */
@RestController
public class helloword {

    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello yry";
    }
}
