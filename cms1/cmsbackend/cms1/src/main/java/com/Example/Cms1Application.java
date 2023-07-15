package com.Example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages = {"com.Example", "com.Example.controll"})
@SpringBootApplication
public class Cms1Application {

	public static void main(String[] args) {
		SpringApplication.run(Cms1Application.class, args);
	}

}
