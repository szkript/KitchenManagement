package com.codecool;

import java.util.Date;

abstract class Employee {
    public double salary;
    public String name;
    public Date birthDate;

    Employee(double salary, String name, Date birthDate) {
        this.salary = salary;
        this.name = name;
        this.birthDate = birthDate;
    }

    private double createTaxReport() {
        return this.salary * 0.99;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }
}
