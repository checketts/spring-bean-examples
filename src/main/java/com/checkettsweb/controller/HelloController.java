package com.checkettsweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by clintchecketts on 2/11/16.
 */
@RequestMapping
@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello(){
        return "Hello World!";
    }

}
