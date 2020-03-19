package com.example.springbootjpa.repository;

import com.example.springbootjpa.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsBaseRepository extends BaseRepository<Students,Integer> {
}
