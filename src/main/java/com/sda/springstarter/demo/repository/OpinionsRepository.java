package com.sda.springstarter.demo.repository;

import com.sda.springstarter.demo.model.Opinions;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by HP on 2017-12-17.
 */
public interface OpinionsRepository extends JpaRepository<Opinions, Long> {
}
