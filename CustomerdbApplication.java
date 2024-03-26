package com.example.Learningdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerdbApplication.class, args);
		System.out.print("Inside the Customer main method");
	}

}
