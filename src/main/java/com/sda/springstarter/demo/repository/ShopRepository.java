package com.sda.springstarter.demo.repository;

import com.sda.springstarter.demo.model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by HP on 2017-12-17.
 */
public interface ShopRepository extends JpaRepository<Shop, Long>{
}
