package org.example.dto;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import org.example.entitys.Student;

import java.util.List;

public class CourseDto {
    private Integer id;

    private String name;

    private List<Integer> listIdStudents;

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

    public List<Integer> getListIdStudents() {
        return listIdStudents;
    }

    public void setListIdStudents(List<Integer> integer) {
        this.listIdStudents = integer;
    }

    @Override
    public String toString() {
        return "CourseDto: " +
                "id = " + id +
                ", name = " + name + '\'' +
                ", integer = " + listIdStudents;
    }
}
