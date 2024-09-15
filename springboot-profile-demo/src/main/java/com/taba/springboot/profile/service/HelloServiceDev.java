package com.taba.springboot.profile.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Profile("dev")
@Slf4j
public class HelloServiceDev implements HelloService {

	@Override
	public String getGreeting() {
		log.warn("log from DEV");
		return "Hello from DEV ";
	}

}
