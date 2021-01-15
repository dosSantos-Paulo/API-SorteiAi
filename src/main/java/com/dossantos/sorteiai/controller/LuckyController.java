package com.dossantos.sorteiai.controller;

import com.dossantos.sorteiai.model.PostModel;
import com.dossantos.sorteiai.utils.ModelGenerator;
import com.dossantos.sorteiai.utils.NumberGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LuckyController {

    @Autowired
    NumberGenerator numberGenerator;
    @Autowired
    ModelGenerator modelGenerator;

    @PostMapping(path = "/api/lucky")
    public String getLuckyNumber(@RequestBody PostModel post) {
        String luckyNumber = numberGenerator.getNumber(post.getLuckyNumberVariable());
        modelGenerator.post(post.getEmail(), luckyNumber);
        return luckyNumber;
    }
}
