package com.taba.springboot.profile.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class HelloServiceProd implements HelloService {

	@Override
	public String getGreeting() {
		return "Hello from PROD ";
	}

}
