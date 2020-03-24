package com.example.springbootjpa.service;

import com.example.springbootjpa.entity.*;
import com.example.springbootjpa.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


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
    public void addDirections(Directions directions){

        directionsBaseRepository.save(directions);

    }
    public void addDirectionsElective(DirectionsElective directionsElective){

        directionsElectiveBaseRepository.save(directionsElective);

    }

    public void addElective(Elective elective){

        electiveBaseRepository.save(elective);

    }

    public Students getStudents(int id){
         return studentsBaseRepository.findById(id).orElse(null);
    }
    public Course getCourse(int id){

        return courseBaseRepository.findById(id).orElse(null);
    }
    public Directions getDirections(int id){

        return directionsBaseRepository.findById(id).orElse(null);
    }
    public DirectionsElective getDirectionsElective(int id){

        return directionsElectiveBaseRepository.findById(id).orElse(null);

    }
    public Elective getEletive(int id){

        return electiveBaseRepository.findById(id).orElse(null);

    }
    public Teacher getTeacher(int id){

        return teacherBaseRepository.findById(id).orElse(null);

    }
}
