package com.pulkit.service;

import com.pulkit.model.Speaker;
import com.pulkit.repository.HibernateSpeakerRepositoryImpl;
import com.pulkit.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("speakerService") // Stereo Type annotation
//Scope can be defined at bean level
@Profile("dev")
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl(){
        System.out.println("SpeakerServiceImpl no args constructor");
    }

    @Autowired // For Constructor Injection
    public SpeakerServiceImpl(SpeakerRepository speakerRepository){
        this.repository = speakerRepository;
        System.out.println("SpeakerServiceImpl repository constructor");

    }

    @PostConstruct
    private void initialize(){
        System.out.println("We're called after the constructor");
    }
    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

//    @Autowired   // For setter Injection
    public void setRepository(SpeakerRepository repository) {

        this.repository = repository;
        System.out.println("SpeakerServiceImpl setter");
    }
}
