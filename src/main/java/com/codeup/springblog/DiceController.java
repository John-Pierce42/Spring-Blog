package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DiceController {

    @GetMapping("/roll-dice")
    Public String rollDive(){
        return "dice/roll-dice";
    }
}

@GetMapping("/roll-dice/{guess}")
public String diceGuess(@PathVariable int guess, Model model){


    int random = Math.random() * 6;

}