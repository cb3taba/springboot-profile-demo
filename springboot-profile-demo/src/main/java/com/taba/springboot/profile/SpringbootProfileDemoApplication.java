package com.taba.springboot.profile;

//https://www.youtube.com/watch?v=QCToCM4nQUQ

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
//@ComponentScan("com.taba.springboot.profile.service")
@Slf4j
public class SpringbootProfileDemoApplication {

	public static void main(String[] args) {
		log.info("Starting profile demo application");
		SpringApplication.run(SpringbootProfileDemoApplication.class, args);
	}


}
