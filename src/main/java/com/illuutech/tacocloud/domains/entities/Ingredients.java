package com.illuutech.tacocloud.domains.entities;

import lombok.Data;

@Data
public class Ingredients {
    private final String id;
    private final String name;
    private final Type type;
    public enum Type{
        WRAP,PROTEIN,VEGGIES,CHEESE,SAUCE
    }
}
