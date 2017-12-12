package com.weekendecdemo.WeekendDecDemo.repositroy;

import com.weekendecdemo.WeekendDecDemo.domain.Student;

import java.util.List;

/**
 * Created by abhi on 10/12/17.
 */
public interface InterfaceDemo {

    String getData();

    List<Student> getStudents();

    Student getStudent(Integer id,String name);

    void saveData(Student st);
}
