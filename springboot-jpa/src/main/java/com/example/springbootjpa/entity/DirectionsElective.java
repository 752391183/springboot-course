package com.example.springbootjpa.entity;

import lombok.Data;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.*;

@Data
@NoRepositoryBean
@Entity
public class DirectionsElective {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String detail;//具体的信息

    @ManyToOne
    private Students students;
    @ManyToOne
    private Directions directions;

}
