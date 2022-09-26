package com.jkngil.pos.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PosAppDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PosAppDiscoveryServiceApplication.class, args);
	}

}
