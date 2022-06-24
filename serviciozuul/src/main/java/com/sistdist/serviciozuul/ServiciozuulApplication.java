package com.sistdist.serviciozuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ServiciozuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiciozuulApplication.class, args);
	}

}
