package com.example.springbootjpa.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerators;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.*;
import java.util.List;

@Entity
@NoRepositoryBean
@Data
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String name;

    private int selectNumber;//可以选择学生的数量

    private int password;//老师登录系统

    @OneToMany(mappedBy = "teacher")
    private List<Students> students;//记录已选择的学生
}
