package com.taba.springboot.profile.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Profile("tud")
@Slf4j
public class HelloServiceTud implements HelloService {

	@Override
	public String getGreeting() {
		log.info("set the log level in logback-spring.xml for tud stage to error !!");
		return "Hello from TU-D ";
	}

}
