package com.example.databaseproject.model;

import jakarta.persistence.*;

import java.sql.Time;
import java.time.LocalDate;


@Entity
@Table(name = "schedule")
public class Schedule {
    @Id
    @Column(name = "scheduleid")
    private Integer scheduleid;

    @Column(name = "time")
    private Time time;

    @Column(name = "dayofweek")
    private String dayofweek;

    public Integer getScheduleid() {
        return this.scheduleid;
    }

    public void setScheduleid(Integer scheduleid) {
        this.scheduleid = scheduleid;
    }

    public Time getTime() {
        return this.time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getDayofweek() {
        return this.dayofweek;
    }

    public void setDayofweek(String dayofweek) {
        this.dayofweek = dayofweek;
    }
}
