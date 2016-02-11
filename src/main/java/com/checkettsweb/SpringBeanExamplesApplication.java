package com.checkettsweb;

import com.checkettsweb.controller.Greeter;
import com.checkettsweb.controller.HelloController;
import com.checkettsweb.controller.InformalGreeter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class SpringBeanExamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBeanExamplesApplication.class, args);
	}

	@Bean
	public HelloController helloController(Greeter greeter){
		return new HelloController(greeter);
	}

	@Bean Greeter greeter(@Value("${greeting.informal}") String greeting){
		return new InformalGreeter(greeting);
	}
}
