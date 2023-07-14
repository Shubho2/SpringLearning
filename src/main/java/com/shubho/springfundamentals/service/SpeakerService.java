package com.shubho.springfundamentals.service;

import com.shubho.springfundamentals.repository.*;

import java.util.List;

import com.shubho.springfundamentals.model.Speaker;

public interface SpeakerService {

	List<Speaker> findAll();
	void setRepository(SpeakerRepository repository);
}