package com.checkettsweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by clintchecketts on 2/11/16.
 */
@RequestMapping
@RestController
public class HelloController {

    private final DateTimeFormatter formatter;

    public HelloController() {
        formatter = DateTimeFormatter.ofPattern("h:mm:ss");
    }

    @RequestMapping("/")
    public String hello(){
        return "Hello World! "+ formatter.format(LocalDateTime.now());
    }

}
