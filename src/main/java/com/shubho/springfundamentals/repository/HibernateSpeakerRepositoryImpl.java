package com.shubho.springfundamentals.repository;

import com.shubho.springfundamentals.model.Speaker;

import org.springframework.stereotype.*;
import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
	
	@Override
	public List<Speaker>  findAll() {
		List<Speaker> speakers = new ArrayList<Speaker>();
		
		Speaker speaker = new Speaker();
		speaker.setFirstName("Shubho");
		speaker.setLastName("Banerjee");
		speakers.add(speaker);
		
		return speakers;
	}  
}
