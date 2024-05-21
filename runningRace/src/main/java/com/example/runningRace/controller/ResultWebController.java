package com.example.runningRace.controller;

import com.example.runningRace.repository.RaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResultWebController {

    @Autowired
    RaceRepository raceRepository;

    @GetMapping("/")
    public String races(Model model) {
        model.addAttribute("races", raceRepository.findAll());
        return "races";
    }
}
