package com.example.mp5;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "courses")
    private Set<Student> students = new HashSet<>();

    public Course(String subject) {
        this.name = subject;
    }

    public String getName() {
        return name;
    }

    // Default constructor
    public Course() {
    }

    // Constructors, getters, and setters
}
