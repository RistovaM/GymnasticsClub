package com.example.databaseproject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "member")
public class Member {
    @Id
    @Column(name = "personid")
    private Integer personid;

    @Column(name = "groupnumberid")
    private Integer groupnumberid;

    @Column(name = "testofknowledgeid")
    private Integer testofknowledgeid;

    public Integer getPersonid() {
        return this.personid;
    }

    public void setPersonid(Integer personid) {
        this.personid = personid;
    }

    public Integer getGroupnumberid() {
        return this.groupnumberid;
    }

    public void setGroupnumberid(Integer groupnumberid) {
        this.groupnumberid = groupnumberid;
    }

    public Integer getTestofknowledgeid() {
        return this.testofknowledgeid;
    }

    public void setTestofknowledgeid(Integer testofknowledgeid) {
        this.testofknowledgeid = testofknowledgeid;
    }
}
