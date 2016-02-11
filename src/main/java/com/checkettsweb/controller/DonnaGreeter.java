package com.checkettsweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by clintchecketts on 2/11/16.
 */
@Component
public class DonnaGreeter extends Greeter{

    @Autowired
    public DonnaGreeter(@Value("${greeting.donna}") String greeting) {
        super(greeting);
    }
}
