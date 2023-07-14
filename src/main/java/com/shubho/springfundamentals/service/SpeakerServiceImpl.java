package com.shubho.springfundamentals.service;

import com.shubho.springfundamentals.repository.*;
import com.shubho.springfundamentals.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;

import java.util.List;

@Service("speakerService")
@Scope(value = BeanDefinition.SCOPE_SINGLETON)
public class SpeakerServiceImpl implements SpeakerService {
	
	private SpeakerRepository repository;
	
	public SpeakerServiceImpl() {
		System.out.println("SpeakerService default constructor is Called");
	}
	
	@Autowired
	public SpeakerServiceImpl(SpeakerRepository repository) {
	System.out.println("speakerService repository constructor is called");
		this.repository = repository;
	}
	
	@Override
	public List<Speaker> findAll() {
		return repository.findAll();
	}
	
//	@Autowired
	public void setRepository(SpeakerRepository repository) {
		System.out.println("SpeakerService setRepository is called");
		this.repository = repository;
	}
}
