package com.example.mp5;

import jakarta.persistence.*;

@Entity
@Table(name = "international_students")
public class InternationalStudent extends Student {
    private String country;

    // Constructors
    public InternationalStudent() {
    }

    public InternationalStudent(String name, String country) {
        super(name);
        this.country = country;
    }

    // Getter and setter for country
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
