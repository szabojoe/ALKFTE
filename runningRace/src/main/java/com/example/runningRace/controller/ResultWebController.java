package com.example.runningRace.controller;

import com.example.runningRace.model.Race;
import com.example.runningRace.repository.RaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ResultWebController {

    @Autowired
    RaceRepository raceRepository;

    @GetMapping("/")
    public String races(Model model) {
        model.addAttribute("races", raceRepository.findAll());
        return "races";
    }

    @PostMapping("/createRace")
    public String createRace(@RequestParam("name") String name, @RequestParam("distance") int distance) {
        Race newRace = new Race();
        newRace.setRaceName(name);
        newRace.setRaceDist(distance);
        raceRepository.save(newRace);
        return "redirect:/";
    }

}
