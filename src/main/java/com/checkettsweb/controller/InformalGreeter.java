package com.checkettsweb.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by clintchecketts on 2/11/16.
 */
@Component
public class InformalGreeter extends Greeter{

    public InformalGreeter(@Value("${greeting.informal}") String greeting) {
        super(greeting);
    }
}
