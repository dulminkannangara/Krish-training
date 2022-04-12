package com.krishantha.rentacar.demoapplication.servicer;

import com.krishantha.rentacar.demoapplication.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    public Student save(Student student){
     return studentRepository.save(student);
    }

}