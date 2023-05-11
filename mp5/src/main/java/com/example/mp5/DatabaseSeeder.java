package com.example.mp5;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DatabaseSeeder implements CommandLineRunner {
    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

    public DatabaseSeeder(StudentRepository studentRepository, CourseRepository courseRepository) {
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public void run(String... args) {
        seedData();
    }

    private void seedData() {
        // Create and save sample students
        Student student1 = new Student("John Doe");
        Student student2 = new Student("Jane Smith");
        studentRepository.saveAll(Arrays.asList(student1, student2));

        Student studentCanada = new InternationalStudent("John Doe","Canada");
        Student studentRussia = new InternationalStudent("Jane Smith","Russia");
        studentRepository.saveAll(Arrays.asList(studentCanada, studentRussia));

        // Create and save sample courses
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Physics");
        Course course3 = new Course("Chemistry");
        courseRepository.saveAll(Arrays.asList(course1, course2, course3));

        // Enroll students in courses
        student1.getCourses().addAll(Arrays.asList(course1, course2));
        student2.getCourses().add(course3);
        studentCanada.getCourses().add(course1);
        studentRussia.getCourses().add(course2);

        studentRepository.saveAll(Arrays.asList(student1, student2));
    }
}