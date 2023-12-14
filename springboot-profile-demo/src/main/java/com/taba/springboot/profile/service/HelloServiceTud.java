package com.taba.springboot.profile.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("tud")
public class HelloServiceTud implements HelloService {

	@Override
	public String getGreeting() {
		return "Hello from TU-D ";
	}

}
