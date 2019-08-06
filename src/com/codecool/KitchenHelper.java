package com.codecool;

import java.util.Date;
import java.util.Map;

public class KitchenHelper extends Employee {
    private java.util.Map<String, Integer> ingredients;

    public KitchenHelper(double salary, String name, Date birthDate, Map<String, Integer> ingredients) {
        super(salary, name, birthDate);
        // need to randomize the ingredients quantity
        this.ingredients.put("carrot", 1);
        this.ingredients.put("potato", 1);
        this.ingredients.put("meat", 1);
    }
}
