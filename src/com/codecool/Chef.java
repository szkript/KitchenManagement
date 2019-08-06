package com.codecool;

import java.util.Date;

public final class Chef extends Employee implements ICook {
    private static Chef chef = null;
    private static double salary;
    private static String name;
    private static Date birthDate;

    private Chef(double salary, String name, Date birthDate) {
        super(salary, name, birthDate);
    }

    public static Chef getInstance() {
        if (chef == null)
            chef = new Chef(salary, name, birthDate);
        return chef;
    }

    @Override
    public String cook() {
        return null;
    }
}

