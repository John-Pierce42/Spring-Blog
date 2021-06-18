package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DiceController {

    @GetMapping("/roll-dice")
    public String rollDice(){
        return "dice/roll-dice";
    }


    @GetMapping("/roll-dice/{guess}")
    public String diceGuess(@PathVariable int guess, Model model) {
        String result;

        int random = (int) Math.ceil(Math.random() * 6);

        if (random == guess) {
            result = "your guess is correct!";
        } else {
            result = "Your guess is incorrect";
        }

        model.addAttribute("result", result);
        model.addAttribute("guess", guess);
        model.addAttribute("random", random);

        return "dice/roll-dice-guess";
    }
}