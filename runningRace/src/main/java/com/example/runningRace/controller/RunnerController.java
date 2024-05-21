package com.example.runningRace.controller;

import com.example.runningRace.model.Runner;
import com.example.runningRace.repository.RunnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/runners")
public class RunnerController {

    @Autowired
    private RunnerRepository runnerRepository;
    @GetMapping("/getRunners")
    public List<Runner> getAllRunners() {
        return runnerRepository.findAll();
    }
}
