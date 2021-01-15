package com.dossantos.sorteiai.model;

import org.springframework.stereotype.Component;

@Component
public class PostModel {
    private String email;
    private Integer luckyNumberVariable;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getLuckyNumberVariable() {
        return luckyNumberVariable;
    }

    public void setLuckyNumberVariable(Integer luckyNumberVariable) {
        this.luckyNumberVariable = luckyNumberVariable;
    }
}
