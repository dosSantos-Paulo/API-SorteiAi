package com.dossantos.sorteiai.utils;

import com.dossantos.sorteiai.model.LuckyModel;
import com.dossantos.sorteiai.repository.LuckyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ModelGenerator {

    @Autowired
    LuckyRepository luckyRepository;

    public void post(String email, String luckyNumber){
        LuckyModel model = new LuckyModel();
        model.setEmail(email);
        model.setLuckyNumber(luckyNumber);

        luckyRepository.save(model);
    }
}
