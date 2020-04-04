package com.pulkit.service;

import com.pulkit.model.Speaker;
import com.pulkit.repository.HibernateSpeakerRepositoryImpl;
import com.pulkit.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }
}
