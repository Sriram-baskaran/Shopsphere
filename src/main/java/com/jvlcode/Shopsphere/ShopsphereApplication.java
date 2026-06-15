package com.jvlcode.Shopsphere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude= {SecurityAutoConfiguration.class})
public class ShopsphereApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopsphereApplication.class, args);
	}

}
