package com.example.databaseproject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Grupa")
//@Table(name = "\"Group\"")
public class Grupa {
    @Id
    @Column(name = "groupnumberid")
    private Integer groupnumberid;

    public Integer getGroupnumberid() {
        return this.groupnumberid;
    }

    public void setGroupnumberid(Integer groupnumberid) {
        this.groupnumberid = groupnumberid;
    }
}
