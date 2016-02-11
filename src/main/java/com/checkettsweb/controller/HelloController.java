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
    private final Greeter greeter;

    public HelloController(Greeter greeter) {
        formatter = DateTimeFormatter.ofPattern("h:mm:ss");
        this.greeter = greeter;
    }

    @RequestMapping("/")
    public String hello(){
        return greeter.greet("World!")+ formatter.format(LocalDateTime.now());
    }

}
