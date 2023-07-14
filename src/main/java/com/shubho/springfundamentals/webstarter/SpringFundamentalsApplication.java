package com.shubho.springfundamentals.webstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;
import org.springframework.context.ApplicationContext;

import com.shubho.springfundamentals.service.*;

//@SpringBootApplication
public class SpringFundamentalsApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringFundamentalsApplication.class, args);
		
//		SpeakerService service = new SpeakerServiceImpl();

		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);
		System.out.println(service);
		
		System.out.println(service.findAll().get(0).getFirstName());
		
		SpeakerService service1 = appContext.getBean("speakerService", SpeakerService.class);
		System.out.println(service1);
				
	}

}