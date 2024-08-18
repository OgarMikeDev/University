package org.example.dto;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import org.example.entitys.Course;

import java.util.List;

public class StudentDto {
    private Integer id;
    private String name;
    private String surName;
    private List<Integer> listCoursesId;

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

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public List<Integer> getListCoursesId() {
        return listCoursesId;
    }

    public void setListCoursesId(List<Integer> integer) {
        this.listCoursesId = integer;
    }

    @Override
    public String toString() {
        return "StudentDto: " +
                "id = " + id +
                ", name = " + name + '\'' +
                ", surName = " + surName + '\'' +
                ", integer = " + listCoursesId;
    }
}
