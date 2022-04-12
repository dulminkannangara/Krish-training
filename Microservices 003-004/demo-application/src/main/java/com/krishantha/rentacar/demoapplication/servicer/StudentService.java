package com.krishantha.rentacar.demoapplication.servicer;

import com.krishantha.rentacar.demoapplication.model.Student;

public interface StudentService {

    Student save(Student student);
    Student fetchStudentById(int id);

}
