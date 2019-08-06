package com.codecool;

import java.util.Date;

public final class Chef extends Employee implements ICook {
    private static Chef chef = null;
    private static final String CHEF_NAME = "Gonzales";
    private Chef() {
        super();
    }

    public static Chef getInstance() {
        if (chef == null)
            chef = new Chef();
        chef.setName(CHEF_NAME);
        chef.setSalary(26000023);
        chef.setBirthDate(new Date());
        return chef;
    }

    @Override
    public String cook() {
        return null;
    }
}

