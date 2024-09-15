package com.taba.springboot.profile.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Profile("tuc")
@Slf4j
public class HelloServiceTuc implements HelloService {

	@Override
	public String getGreeting() {
		log.warn("log from TU-C");
		return "Hello from TU-C ";
	}

}
