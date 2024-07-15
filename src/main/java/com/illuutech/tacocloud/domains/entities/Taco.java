package com.illuutech.tacocloud.domains.entities;

import lombok.Data;

import java.util.List;

@Data
public class Taco {
    private String name;
    private List<Ingredients> ingredientsList;

}
