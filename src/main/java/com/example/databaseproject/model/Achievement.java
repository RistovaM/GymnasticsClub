package com.example.databaseproject.model;

import jakarta.persistence.*;


@Entity
@Table(name = "achievement")
public class Achievement {
    @Id
    @Column(name = "achievementid")
    private Integer achievementid;

    @Column(name = "achievementtype")
    private String achievementtype;

    @Id
    @Column(name = "competitionid")
    private Integer competitionid;

    @Column(name = "personid")
    private Integer personid;

    public Integer getAchievementid() {
        return this.achievementid;
    }

    public void setAchievementid(Integer achievementid) {
        this.achievementid = achievementid;
    }

    public String getAchievementtype() {
        return this.achievementtype;
    }

    public void setAchievementtype(String achievementtype) {
        this.achievementtype = achievementtype;
    }

    public Integer getCompetitionid() {
        return this.competitionid;
    }

    public void setCompetitionid(Integer competitionid) {
        this.competitionid = competitionid;
    }

    public Integer getPersonid() {
        return this.personid;
    }

    public void setPersonid(Integer personid) {
        this.personid = personid;
    }
}
