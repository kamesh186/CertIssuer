package com.example.certIssuer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition
public class CertIssuerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CertIssuerApplication.class, args);
		
		
		
	}

}
