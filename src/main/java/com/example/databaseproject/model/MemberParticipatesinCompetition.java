package com.example.databaseproject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "member_participatesin_competition")
public class MemberParticipatesinCompetition {
    @Id
    @Column(name = "personid")
    private Integer personid;

    @Id
    @Column(name = "competitionid")
    private Integer competitionid;

    public Integer getPersonid() {
        return this.personid;
    }

    public void setPersonid(Integer personid) {
        this.personid = personid;
    }

    public Integer getCompetitionid() {
        return this.competitionid;
    }

    public void setCompetitionid(Integer competitionid) {
        this.competitionid = competitionid;
    }
}
