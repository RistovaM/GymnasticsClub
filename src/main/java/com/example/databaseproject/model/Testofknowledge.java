package com.example.databaseproject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "testofknowledge")
public class Testofknowledge {
    @Id
    @Column(name = "testofknowledgeid")
    private Integer testofknowledgeid;

    @Column(name = "points")
    private Integer points;

    public Integer getTestofknowledgeid() {
        return this.testofknowledgeid;
    }

    public void setTestofknowledgeid(Integer testofknowledgeid) {
        this.testofknowledgeid = testofknowledgeid;
    }

    public Integer getPoints() {
        return this.points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }
}
