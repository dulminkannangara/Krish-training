package com.krishantha.rentacar.demoapplication.repository;

import com.krishantha.rentacar.demoapplication.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.Repository;

//public interface StudentRepository extends Repository<Student,Integer> {
//    Student save (Student student);
//
//}

// Table and primary key type --> Student, Integer
public interface StudentRepository extends JpaRepository<Student,Integer> {

}