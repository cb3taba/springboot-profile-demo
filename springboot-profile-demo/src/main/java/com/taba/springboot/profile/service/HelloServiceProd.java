package com.taba.springboot.profile.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Profile("prod")
@Slf4j
public class HelloServiceProd implements HelloService {

	@Override
	public String getGreeting() {
		log.error("log from PROD");
		return "Hello from PROD ";
	}

}
