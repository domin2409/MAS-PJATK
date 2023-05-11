package com.example.mp5;

import org.springframework.stereotype.Service;

@Service
public class StudentCourseService {
    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

    public StudentCourseService(StudentRepository studentRepository, CourseRepository courseRepository) {
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    public void retrieveStudentAndCourses(Long studentId) {
        Student student = studentRepository.findById(studentId).orElse(null);
        if (student == null) {
            System.out.println("Student not found!");
            return;
        }

        System.out.println("Student: " + student.getName());
        System.out.println("Courses:");

        for (Course course : student.getCourses()) {
            System.out.println(course.getName());
        }
    }

}

