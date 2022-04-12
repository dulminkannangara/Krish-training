package com.krishantha.rentacar.demoapplication.controller;

import com.krishantha.rentacar.demoapplication.model.Student;
import com.krishantha.rentacar.demoapplication.servicer.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String greeting(){
        return "Hello Springboot";
    }

    @RequestMapping(value = "/hello",method = RequestMethod.POST)
    public String greeting2(){
        return "Hello Springboot from POST";
    }

    @RequestMapping(value = "/student",method = RequestMethod.POST)
    public Student sane(@RequestBody Student student){
        return studentService.save(student);
    }

}
