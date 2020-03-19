package com.example.springbootjpa.entity;

import lombok.Data;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.*;
import java.util.List;

@Data
@NoRepositoryBean
@Entity
public class Students {
     @Id

    private int id;
    private String name;

    private Boolean whetherSelected;//是否被老师选中
    @ManyToOne
   private Teacher teacher;

    @OneToMany(mappedBy = "students")
    private List<Elective> electives ; //学生与课程之间的联系

    @OneToMany(mappedBy = "students")
    private List<DirectionsElective> directionsElectives;//学生与方向之间的联系



}
