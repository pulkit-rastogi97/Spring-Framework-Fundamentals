package com.pulkit.service;

import com.pulkit.model.Speaker;
import com.pulkit.repository.HibernateSpeakerRepositoryImpl;
import com.pulkit.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository speakerRepository ;

    @Override
    public List<Speaker> findAll(){
        return speakerRepository.findAll();
    }

    public SpeakerServiceImpl(){

    }

    public  SpeakerServiceImpl(SpeakerRepository speakerRepository){
        this.speakerRepository = speakerRepository;
    }

    public void setSpeakerRepository(SpeakerRepository repository) {
        this.speakerRepository = repository;
    }
}
