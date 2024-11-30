package com.example.databaseproject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "coach_teaches_member")
public class CoachTeachesMember {
    @Id
    @Column(name = "personmemberid")
    private Integer personmemberid;

    @Id
    @Column(name = "personcoachid")
    private Integer personcoachid;

    public Integer getPersonmemberid() {
        return this.personmemberid;
    }

    public void setPersonmemberid(Integer personmemberid) {
        this.personmemberid = personmemberid;
    }

    public Integer getPersoncoachid() {
        return this.personcoachid;
    }

    public void setPersoncoachid(Integer personcoachid) {
        this.personcoachid = personcoachid;
    }
}
