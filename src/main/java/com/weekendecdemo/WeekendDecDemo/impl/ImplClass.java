package com.weekendecdemo.WeekendDecDemo.impl;

import com.weekendecdemo.WeekendDecDemo.domain.Student;
import com.weekendecdemo.WeekendDecDemo.repositroy.InterfaceDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.sql.Types;
import java.util.List;

/**
 * Created by abhi on 10/12/17.
 */

@Repository
public class ImplClass implements InterfaceDemo {

    @Override
    public String getData() {
        return "check data";
    }

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Student> getStudents() {

        String sql="select * from student";
        List<Student> list=jdbcTemplate
                .query(sql,new BeanPropertyRowMapper<>(Student.class));

        return list;
    }

    @Override
    public Student getStudent(Integer id,String name) {

        String sql="select * from student where id=? and name=?";
        Student list=jdbcTemplate
                .queryForObject(sql,new Object[]{id,name},new BeanPropertyRowMapper<>(Student.class));

        return list;
    }

    @Override
    public void saveData(Student st) {
        String sql="insert into student values(?,?,?)";

        jdbcTemplate.update(sql,
                new Object[]{st.getId(),st.getName(),st.getCity()},
                new int[]{Types.INTEGER,Types.VARCHAR,Types.VARCHAR});
    }
}
