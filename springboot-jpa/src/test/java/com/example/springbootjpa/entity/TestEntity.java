package com.example.springbootjpa.entity;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Slf4j
@Transactional
@SpringBootTest
@Rollback(value = false)
public class TestEntity {
    @Autowired
    private EntityManager entityManager;

    @Test
    public void test_init(){
       //初始化学生1
        Students stu1 = new Students();
        stu1.setName("张思源");
        stu1.setId(2017214216);
        entityManager.persist(stu1);
        //初始化学生2
        Students stu2 = new Students();
        stu2.setName("CCL");
        stu2.setId(2017214000);
        entityManager.persist(stu2);
        //初始化课程1
        Course c1 = new Course();
        c1.setName("JAVA");
        entityManager.persist(c1);
        //初始化课程2
        Course c2 = new Course();
        c2.setName("Web框架");
        entityManager.persist(c2);
        //初始化老师
        Teacher t1 = new Teacher();
        t1.setName("王波");
        entityManager.persist(t1);

    }


}
