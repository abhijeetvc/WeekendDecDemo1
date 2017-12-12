package com.weekendecdemo.WeekendDecDemo.domain;

/**
 * Created by abhi on 10/12/17.
 */
public class Student {

    Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    String name;
    String city;
}
