package com.checkettsweb.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by clintchecketts on 2/11/16.
 */
abstract public class Greeter  {

    private final String greeting;

    public Greeter(String greeting) {
        this.greeting = greeting;
    }

    public String greet(String subject){
        return greeting+" "+subject;
    }
}
