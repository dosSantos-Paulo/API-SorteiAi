package com.dossantos.sorteiai.model;

import org.springframework.stereotype.Component;

@Component
public class NumberGenerator {

    public String generator(Integer number) throws Exception {

        if (number >= 4 && number <= 6) {
            String luckyNumber = "";

            for (int i = 1; i <= number; i++) {
                Integer randomNumber = Math.toIntExact(Math.round(Math.random() * 9));
                luckyNumber = luckyNumber + randomNumber.toString();
            }


            return luckyNumber;
        } else {
            throw new Exception("the number must be between 4 and 6");
        }

    }
}
