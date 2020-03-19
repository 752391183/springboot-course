package com.example.springbootjpa.entity;

import lombok.Data;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.*;
import java.util.List;

@Data
@NoRepositoryBean
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String name;

    private int value;//权值
    private int minGrade;//课程的最低分

   @OneToMany(mappedBy = "course")
    private List<Elective> electives;//课程与学生之间的联系


}
