package com.example.RateLimiterClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class RateLimiterClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(RateLimiterClientApplication.class, args);
	}

}
