package com.microservices.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class DemoEurekaOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoEurekaOauthApplication.class, args);
	}

}

