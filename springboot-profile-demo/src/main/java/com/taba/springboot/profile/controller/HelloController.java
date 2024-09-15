package com.taba.springboot.profile.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.taba.springboot.profile.service.HelloService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@Slf4j
public class HelloController {
	
	private final HelloService helloService;
	
	@Value("${logging.file}")
	private String loggingFile;
	
	@Value("${myproperty}")
	private String myProperty;
	
	@GetMapping("/index")
	public String sayHello(Model model) {
		model.addAttribute("greeting", helloService.getGreeting() 
				+ "logging file is: " + loggingFile + " and myproperty is: " + myProperty);
		log.info(helloService.getGreeting() 
				+ "logging file is: " + loggingFile + " and myproperty is: " + myProperty);
		
		if (log.isErrorEnabled()) {
	  	log.error(helloService.getGreeting() 
	  			+ "if the stage = tud or stage = prod then logging file is: " + loggingFile + " and myproperty is: " + myProperty);
	  	log.warn("this log must not seen in the console set the log level for dev to warn");
		}
		
		if (log.isWarnEnabled()) {
			log.warn("set the log level for dev to warn");
			log.warn(helloService.getGreeting() 
					+ "if the stage = dev then logging file is: " + loggingFile + " and myproperty is: " + myProperty);
			
		}
		return "hello";
	}

}
