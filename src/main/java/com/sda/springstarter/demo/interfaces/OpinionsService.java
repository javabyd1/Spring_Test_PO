package com.sda.springstarter.demo.interfaces;

import com.sda.springstarter.demo.model.Opinions;

import java.util.List;

/**
 * Created by HP on 2017-12-17.
 */
public interface OpinionsService {


    List<Opinions> getAllOpinions();
    void saveOpinion(Opinions opinions);
}
