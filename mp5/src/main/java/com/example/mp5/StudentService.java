package com.example.mp5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository, CourseRepository courseRepository) {
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    public void enrollStudentInCourses(Long studentId, List<Long> courseIds) {
        Student student = studentRepository.findById(studentId).orElse(null);
        if (student == null) {
            // Handle the case when the student is not found
            return;
        }

        List<Course> courses = courseRepository.findAllById(courseIds);
        student.getCourses().addAll(courses);
        studentRepository.save(student);
    }
    @Transactional
    public void getStudents() {
        List<Student> students = studentRepository.findAll();

        for (Student student: students) {
            System.out.println("Student: " + student.getName());

        }
    }

    @Transactional
    public void getStudentsByName() {
        List<Student> students = studentRepository.findByName("John Doe");

        for (Student student: students) {
            System.out.println("Student: " + student.getName());

        }
    }

}
