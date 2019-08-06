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

    public Employee() {
    }

    private double createTaxReport() {
        return this.salary * 0.99;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
