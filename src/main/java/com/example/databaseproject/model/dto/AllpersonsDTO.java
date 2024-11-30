package com.example.databaseproject.model.dto;

import org.hibernate.annotations.Immutable;

import java.time.LocalDate;

@Immutable
public class AllpersonsDTO {
    private Long personid;
    private LocalDate dateofbirth;
    private String lastname;
    private String fisrtname;
    private String tellno;

    public Long getPersonid() {
        return this.personid;
    }

    public void setPersonid(Long personid) {
        this.personid = personid;
    }

    public LocalDate getDateofbirth() {
        return this.dateofbirth;
    }

    public void setDateofbirth(LocalDate dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFisrtname() {
        return this.fisrtname;
    }

    public void setFisrtname(String fisrtname) {
        this.fisrtname = fisrtname;
    }

    public String getTellno() {
        return this.tellno;
    }

    public void setTellno(String tellno) {
        this.tellno = tellno;
    }
}
