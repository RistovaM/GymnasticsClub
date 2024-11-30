package com.example.databaseproject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "coach")
public class Coach {
    @Id
    @Column(name = "personid")
    private Integer personid;
 
    public Integer getPersonid() {
        return this.personid;
    }

    public void setPersonid(Integer personid) {
        this.personid = personid;
    }
}
