package com.dossantos.sorteiai.model;

import javax.persistence.*;

@Entity(name = "db_lucky")
public class LuckyModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String email;

    @Column
    private String luckyNumber;

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLuckyNumber() {
        return luckyNumber;
    }

    public void setLuckyNumber(String luckyNumber) {
        this.luckyNumber = luckyNumber;
    }
}
