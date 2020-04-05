package com.pulkit.repository;

import com.pulkit.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository")
//Scope can be defined at bean level
@Profile("dev")
public class HibernateSpeakerRepositoryImpl implements  SpeakerRepository{

    @Autowired
    private Calendar calendar;

    @Value("#{ T(java.lang.Math).random() * 100 }")
    private double seedNum;

    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Pulkit");
        speaker.setLastName("Rastogi");
        speaker.setSeedNum(seedNum);

        System.out.println("calender : "+calendar.getTime());
        speakers.add(speaker);

        return speakers;
    }
}
