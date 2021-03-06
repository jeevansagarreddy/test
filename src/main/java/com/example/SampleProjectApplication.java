package com.example;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan({"com.example.*"})
@SpringBootApplication
public class SampleProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleProjectApplication.class, args);
	}
}

