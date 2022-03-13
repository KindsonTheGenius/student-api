package com.kindsonthegenius.demos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StudentApiApplication {


	public static void main(String[] args) {
		SpringApplication.run(StudentApiApplication.class, args);
	}

}
