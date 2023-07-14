package com.shubho.springfundamentals.webstarter;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;
import com.shubho.springfundamentals.service.*;
import com.shubho.springfundamentals.repository.*;

@Configuration
@ComponentScan({"com.shubho.springfundamentals"})
public class AppConfig {
	
	/*
	@Bean(name = "speakerService")
	@Scope(value = BeanDefinition.SCOPE_SINGLETON)
	public SpeakerService getSpeakerServices() {
//		SpeakerService service = new SpeakerServiceImpl(getSpeakerRepository());
		SpeakerService service = new SpeakerServiceImpl();
//		service.setRepository(getSpeakerRepository());
		return service;
	}
	*/
	
	/*
	@Bean(name = "speakerRepository")
	public SpeakerRepository getSpeakerRepository() {
		return new HibernateSpeakerRepositoryImpl();
	}
	*/
}
