package com.sistdist.servicioeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class ServicioeurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioeurekaApplication.class, args);
	}

}
