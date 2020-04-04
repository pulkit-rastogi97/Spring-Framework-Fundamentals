package com.pulkit.repository;

import com.pulkit.model.Speaker;
import java.util.List;

public interface SpeakerRepository {

    public List<Speaker> findAll();
}
