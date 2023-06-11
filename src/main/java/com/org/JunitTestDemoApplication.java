package com.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JunitTestDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(JunitTestDemoApplication.class, args);

		System.out.println("============ main method completed ====================");

	}

}
