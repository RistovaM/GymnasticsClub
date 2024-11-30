package com.example.databaseproject.model;

import jakarta.persistence.*;


@Entity
@Table(name = "class")
public class Class {
    @Id
    @Column(name = "classid")
    private Integer classid;

    @Column(name = "classname")
    private String classname;

    public Integer getClassid() {
        return this.classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getClassname() {
        return this.classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }
}
