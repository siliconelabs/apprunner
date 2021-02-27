package com.project.apprunner.apprunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.project.apprunner","org.scope"})
public class ApprunnerApplication {

	public static void main(String[] args) {

		SpringApplication.run(ApprunnerApplication.class, args);
	}

}
