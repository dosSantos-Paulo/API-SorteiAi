package com.dossantos.sorteiai.controller;

import com.dossantos.sorteiai.model.LuckyModel;
import com.dossantos.sorteiai.model.PostModel;
import com.dossantos.sorteiai.repository.LuckyRepository;
import com.dossantos.sorteiai.utils.ModelGenerator;
import com.dossantos.sorteiai.utils.NumberGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LuckyController {

    @Autowired
    NumberGenerator numberGenerator;
    @Autowired
    ModelGenerator modelGenerator;
    @Autowired
    LuckyRepository luckyRepository;

    @PostMapping(path = "/api/lucky")
    public String getLuckyNumber(@RequestBody PostModel post) {
        String luckyNumber;
        List<LuckyModel> list = luckyRepository.findAllByEmail(post.getEmail());

        Boolean validator = true;
        do {

            luckyNumber = numberGenerator.getNumber(post.getLuckyNumberVariable());

            for (LuckyModel model : list) {
                if (luckyNumber.equals(model.getLuckyNumber())) {
                    validator = false;
                    break;
                } else {
                    validator = true;
                }
            }

        } while (!validator);


        if (luckyNumber.length() >= 4 && luckyNumber.length() <= 6) {
            modelGenerator.post(post.getEmail(), luckyNumber);
        }

        return luckyNumber;
    }

    @GetMapping(path = "/api/list/{email}")
    public List<LuckyModel> list(@PathVariable("email") String email) {
        return luckyRepository.findAllByEmail(email);
    }
}
