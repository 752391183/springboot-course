package com.example.springbootjpa.entity;

import lombok.Data;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.*;
import java.util.List;

@Data
@NoRepositoryBean
@Entity
public class Directions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    private int value;//方向的权重

     @OneToMany(mappedBy = "directions")
    private List<DirectionsElective> directionsElectives;//方向和学生之间的联系

}
