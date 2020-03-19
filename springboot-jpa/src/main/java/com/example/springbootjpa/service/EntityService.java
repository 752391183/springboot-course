package com.example.springbootjpa.service;

import com.example.springbootjpa.entity.Course;
import com.example.springbootjpa.entity.Students;
import com.example.springbootjpa.entity.Teacher;
import com.example.springbootjpa.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional

public class EntityService {
    @Autowired
    private StudentsBaseRepository studentsBaseRepository;
    @Autowired
    private CourseBaseRepository courseBaseRepository;
    @Autowired
    private TeacherBaseRepository teacherBaseRepository;
    @Autowired
    private ElectiveBaseRepository electiveBaseRepository;
    @Autowired
    private DirectionsBaseRepository directionsBaseRepository;
    @Autowired
    private DirectionsElectiveBaseRepository directionsElectiveBaseRepository;

    public void addStudents(Students students){

        studentsBaseRepository.save(students);

    }
    public void addCourse(Course course){

        courseBaseRepository.save(course);

    }
    public void addTeacher(Teacher teacher){

        teacherBaseRepository.save(teacher);

    }
}
