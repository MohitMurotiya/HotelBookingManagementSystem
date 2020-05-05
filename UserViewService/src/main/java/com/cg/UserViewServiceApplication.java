package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.cg*")
public class UserViewServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserViewServiceApplication.class, args);
	}

}
