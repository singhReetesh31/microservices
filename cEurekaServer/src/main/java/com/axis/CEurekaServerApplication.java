package com.axis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class CEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CEurekaServerApplication.class, args);
	}

}
