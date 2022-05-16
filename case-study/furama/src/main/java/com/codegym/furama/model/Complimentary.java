package com.codegym.furama.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Complimentary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String complimentaryName;
    public Complimentary() {
    }

    public Complimentary(String complimentaryName) {
        this.complimentaryName = complimentaryName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComplimentaryName() {
        return complimentaryName;
    }

    public void setComplimentaryName(String complimentaryName) {
        this.complimentaryName = complimentaryName;
    }
}
