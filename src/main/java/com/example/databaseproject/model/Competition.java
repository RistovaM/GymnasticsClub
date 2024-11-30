package com.example.databaseproject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "competition")
public class Competition {
    @Id
    @Column(name = "competitionid")
    private Integer competitionid;

    @Column(name = "competitiontype")
    private String competitiontype;

    public Integer getCompetitionid() {
        return this.competitionid;
    }

    public void setCompetitionid(Integer competitionid) {
        this.competitionid = competitionid;
    }

    public String getCompetitiontype() {
        return this.competitiontype;
    }

    public void setCompetitiontype(String competitiontype) {
        this.competitiontype = competitiontype;
    }
}
