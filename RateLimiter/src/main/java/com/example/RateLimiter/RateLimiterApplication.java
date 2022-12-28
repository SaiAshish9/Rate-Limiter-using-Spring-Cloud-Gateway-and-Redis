package com.example.RateLimiter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class RateLimiterApplication {

//	key used for rate limiter every time a re q comes in
//	could be user ,host

	@Bean
	public KeyResolver keyResolver(){
		return exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getAddress().getHostAddress());
	}
//	using host class

	public static void main(String[] args) {
		SpringApplication.run(RateLimiterApplication.class, args);
	}

}
