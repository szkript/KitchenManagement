package com.codecool;

import java.util.Date;

public class Cook extends Employee implements ICook {
    public Cook(double salary, String name, Date birthDate) {
        super(salary, name, birthDate);
    }

    @Override
    public String cook() {
        return null;
    }
}
