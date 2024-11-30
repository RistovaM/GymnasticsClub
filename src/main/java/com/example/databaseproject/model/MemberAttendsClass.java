package com.example.databaseproject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "member_attends_class")
public class MemberAttendsClass {
    @Id
    @Column(name = "personid")
    private Integer personid;

    @Id
    @Column(name = "classid")
    private Integer classid;

    public Integer getPersonid() {
        return this.personid;
    }

    public void setPersonid(Integer personid) {
        this.personid = personid;
    }

    public Integer getClassid() {
        return this.classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }
}
