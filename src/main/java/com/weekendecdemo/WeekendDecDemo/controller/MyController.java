package com.weekendecdemo.WeekendDecDemo.controller;

import com.weekendecdemo.WeekendDecDemo.domain.Student;
import com.weekendecdemo.WeekendDecDemo.impl.ImplClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by abhi on 10/12/17.
 */


@RestController
@RequestMapping(value="/first")
public class MyController {

//    @Autowired
//    public void setImplClass(ImplClass implClass) {
//        this.implClass = implClass;
//    }

    @Autowired
    private ImplClass implClass;

//    public MyController(ImplClass implClass){
//        this.implClass=implClass;
//    }



    @RequestMapping(value="/check")
    String sayHello(){

        String s=implClass.getData();
        return s;
    }

    @GetMapping(value="/getstudents")
    public List<Student> getStu(){

        List<Student> li=implClass.getStudents();
        return li;
    }

    @GetMapping(value="/getstudent/{id}/{name}")
    public Student getStudent(@PathVariable Integer id,
                              @PathVariable String name){

        Student li=implClass.getStudent(id,name);
        return li;
    }

    @PostMapping(value="/savestudent")
    public String getStudent(@RequestBody Student student){

        implClass.saveData(student);
        return "Data saved Successfully";
    }


    @RequestMapping(value="/check1")
    String sayHello1(){

        return "hello spring1";
    }
}
