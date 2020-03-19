package com.example.springbootjpa.entity;

import lombok.Data;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.*;

@NoRepositoryBean
@Data
@Entity
public class Elective {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String detail;//具体的信息

    private int grade;//课程的成绩

    @ManyToOne
    private Course course;
    @ManyToOne
    private Students students;


}
