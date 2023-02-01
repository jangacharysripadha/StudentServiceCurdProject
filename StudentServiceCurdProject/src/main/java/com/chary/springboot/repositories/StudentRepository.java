package com.chary.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chary.springboot.entities.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

}
