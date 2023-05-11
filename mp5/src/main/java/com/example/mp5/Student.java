package com.example.mp5;


import jakarta.persistence.*;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Entity
@Table(name = "students")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    private String name;

    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(name = "student_courses",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
    private Set<Course> courses = new HashSet<>();

    // Constructors
    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}
