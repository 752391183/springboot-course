package com.example.springbootjpa.repository;

import com.example.springbootjpa.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseBaseRepository extends BaseRepository<Course,Integer> {
}
