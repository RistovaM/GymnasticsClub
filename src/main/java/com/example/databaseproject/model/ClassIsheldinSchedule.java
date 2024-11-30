package com.example.databaseproject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "class_isheldin_schedule")
public class ClassIsheldinSchedule {
    @Id
    @Column(name = "scheduleid")
    private Integer scheduleid;

    @Id
    @Column(name = "classid")
    private Integer classid;

    public Integer getScheduleid() {
        return this.scheduleid;
    }

    public void setScheduleid(Integer scheduleid) {
        this.scheduleid = scheduleid;
    }

    public Integer getClassid() {
        return this.classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }
}
