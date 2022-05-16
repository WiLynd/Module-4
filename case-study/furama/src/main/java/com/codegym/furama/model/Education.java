package com.codegym.furama.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String educationName;
    @OneToMany(mappedBy = "education",cascade = CascadeType.ALL)
    @JsonBackReference
    private Set<Employee> employees;


    public Education() {
    }

    public Education(String educationName) {
        this.educationName = educationName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEducationName() {
        return educationName;
    }

    public void setEducationName(String educationName) {
        this.educationName = educationName;
    }
}