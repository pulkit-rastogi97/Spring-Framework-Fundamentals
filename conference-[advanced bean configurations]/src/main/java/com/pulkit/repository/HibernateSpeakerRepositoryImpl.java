package com.pulkit.repository;

import com.pulkit.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
//Scope can be defined at bean level
public class HibernateSpeakerRepositoryImpl implements  SpeakerRepository{

    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Pulkit");
        speaker.setLastName("Rastogi");

        speakers.add(speaker);

        return speakers;
    }
}
