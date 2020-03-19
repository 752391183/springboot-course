package com.example.springbootjpa.repository;

import com.example.springbootjpa.entity.Teacher;
import javafx.beans.property.adapter.JavaBeanProperty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherBaseRepository extends BaseRepository<Teacher,Integer> {

}
