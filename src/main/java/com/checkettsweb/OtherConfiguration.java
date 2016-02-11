package com.checkettsweb;

import com.checkettsweb.controller.DonnaGreeter;
import com.checkettsweb.controller.Greeter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by clintchecketts on 2/11/16.
 */
@Configuration
public class OtherConfiguration {
    @Bean
    Greeter greeter(@Value("${greeting.donna}") String greeting){
        return new DonnaGreeter(greeting);
    }
}
