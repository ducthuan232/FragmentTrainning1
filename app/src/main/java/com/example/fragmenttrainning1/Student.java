package com.example.fragmenttrainning1;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int yearBorn;
    private String address;
    private String email;

    public Student(String name, int yearBorn, String address, String email) {
        this.name = name;
        this.yearBorn = yearBorn;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getYearBorn() {
        return yearBorn;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }
}