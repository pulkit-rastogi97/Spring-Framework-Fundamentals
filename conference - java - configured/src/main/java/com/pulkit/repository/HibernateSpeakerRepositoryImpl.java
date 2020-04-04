package com.pulkit.repository;

import com.pulkit.model.Speaker;

import java.util.ArrayList;
import java.util.List;

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
