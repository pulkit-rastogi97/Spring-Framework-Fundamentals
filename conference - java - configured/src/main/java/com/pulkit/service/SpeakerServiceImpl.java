package com.pulkit.service;

import com.pulkit.model.Speaker;
import com.pulkit.repository.HibernateSpeakerRepositoryImpl;
import com.pulkit.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl(){
        System.out.println("SpeakerServiceImpl no args constructor");
    }
    public SpeakerServiceImpl(SpeakerRepository speakerRepository){
        this.repository = speakerRepository;
        System.out.println("SpeakerServiceImpl repository constructor");

    }
    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

    @Autowired
    public void setRepository(SpeakerRepository repository) {

        this.repository = repository;
        System.out.println("SpeakerServiceImpl setter");
    }
}
