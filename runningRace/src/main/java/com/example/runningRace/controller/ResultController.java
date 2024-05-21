package com.example.runningRace.controller;

import com.example.runningRace.model.Result;
import com.example.runningRace.model.Runner;
import com.example.runningRace.model.Race;
import com.example.runningRace.repository.RaceRepository;
import com.example.runningRace.repository.ResultRepository;
import com.example.runningRace.repository.RunnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/results")
public class ResultController {

    @Autowired
    private ResultRepository resultRepository;
    @Autowired
    private RunnerRepository runnerRepository;
    @Autowired
    private RaceRepository raceRepository;

    @GetMapping("/getRaceRunners/{id}")
    public List<Result> getRaceRunners(@PathVariable Long id) {
        return resultRepository.findByRaceIdOrderByResultTimeAsc(id);
    }

    @PostMapping("/addResult")
    public ResponseEntity<String> insertResult(@RequestBody Result newResult) {
        Long runnerId = newResult.getRunnerId();
        Long raceId =newResult.getRaceId();
        Runner existingRunner=runnerRepository.findById(runnerId).orElse(null);
        Race existingRace=raceRepository.findById(raceId).orElse(null);

        if(existingRace == null || existingRunner == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Race with id: "+ raceId + " or Runner with id: "+ runnerId + " not found");
        }

        newResult.setResultParticipantId(runnerId);
        newResult.setResultRaceId(raceId);
        newResult.setResultTime(newResult.getResultTime());
        resultRepository.save(newResult);

        return ResponseEntity.ok("Result added successfully");

    }
}
