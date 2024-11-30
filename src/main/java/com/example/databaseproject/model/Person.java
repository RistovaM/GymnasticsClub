package com.example.databaseproject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @Column(name = "personid")
    private Integer personid;

    @Column(name = "dateofbirth")
    private LocalDate dateofbirth;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "fisrtname")
    private String fisrtname;

    @Column(name = "tellno")
    private String tellno;

    public Integer getPersonid() {
        return this.personid;
    }

    public void setPersonid(Integer personid) {
        this.personid = personid;
    }

    public LocalDate getDateofbirth() {
        return this.dateofbirth;
    }

    public void setDateofbirth(LocalDate dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFisrtname() {
        return this.fisrtname;
    }

    public void setFisrtname(String fisrtname) {
        this.fisrtname = fisrtname;
    }

    public String getTellno() {
        return this.tellno;
    }

    public void setTellno(String tellno) {
        this.tellno = tellno;
    }
}
