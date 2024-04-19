package com.example.DMS;

/**
 * Jahnavi Chava
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@EntityScan("com.example.DMS.Models")
@SpringBootApplication
public class DogsManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(DogsManagementSystemApplication.class, args);
	}

}
