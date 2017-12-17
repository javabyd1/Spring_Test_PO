package com.sda.springstarter.demo.interfaces;

import com.sda.springstarter.demo.model.Shop;

import java.util.List;

/**
 * Created by HP on 2017-12-17.
 */
public interface ShopService {

    List<Shop> getAllShops();
    void saveShop(Shop shop);


}
