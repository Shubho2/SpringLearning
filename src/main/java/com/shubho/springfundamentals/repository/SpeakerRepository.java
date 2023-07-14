package com.shubho.springfundamentals.repository;

import java.util.List;

import com.shubho.springfundamentals.model.Speaker;

public interface SpeakerRepository {
	List<Speaker> findAll();
}