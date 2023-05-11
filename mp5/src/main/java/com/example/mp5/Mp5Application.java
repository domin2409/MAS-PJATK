package com.example.mp5;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

//@SpringBootApplication
@EntityScan("com.example.mp5")
@SpringBootApplication(scanBasePackages = "com.example.mp5")
public class Mp5Application implements CommandLineRunner {
    private final StudentCourseService studentCourseService;
    private final StudentService studentService;

    public Mp5Application(StudentCourseService studentCourseService, StudentService studentService) {
        this.studentCourseService = studentCourseService;
        this.studentService = studentService;
    }

    public static void main(String[] args) {

        SpringApplication.run(Mp5Application.class, args);
    }
    @Override
    public void run(String... args) {
        // Invoke the method to retrieve student and associated courses
//        studentService.getStudents();
//        studentService.getStudentsByName();
        studentCourseService.retrieveStudentAndCourses(2L);
    }
}
