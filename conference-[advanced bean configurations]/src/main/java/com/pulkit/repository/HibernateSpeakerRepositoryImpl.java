package com.pulkit.repository;

import com.pulkit.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository")
//Scope can be defined at bean level
public class HibernateSpeakerRepositoryImpl implements  SpeakerRepository{

    @Autowired
    private Calendar calendar;


    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Pulkit");
        speaker.setLastName("Rastogi");

        System.out.println("calender : "+calendar.getTime());
        speakers.add(speaker);

        return speakers;
    }
}
