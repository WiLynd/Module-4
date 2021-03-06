package com.codegym.furama.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String divisionName;

    @OneToMany(mappedBy = "division",cascade = CascadeType.ALL)
    @JsonBackReference
    private Set<Employee> employees;

    public Division() {
    }

    public Division(String divisionName) {
        this.divisionName = divisionName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }
}