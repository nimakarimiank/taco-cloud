package com.illuutech.tacocloud.domains.entities;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TacoOrder {
    private long id;
    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;
    private List<Taco> tacoList = new ArrayList<>();
    public void addTacos(Taco taco){
        this.tacoList.add(taco);
    }
}
