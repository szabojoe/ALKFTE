package com.example.runningRace.controller;

import com.example.runningRace.model.Race;
import com.example.runningRace.repository.RaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/races")
public class RaceController {

    @Autowired
    private RaceRepository raceRepository;

    @PostMapping("/updateRace")
    public ResponseEntity<String> updateRace(@RequestBody Race updatedRace){
        Long id = updatedRace.getRaceId();
        Race existingRace=raceRepository.findById(id).orElse(null);
        if(existingRace==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Race with ID: " + id + " not found");
        }

        existingRace.setRaceDist(updatedRace.getRaceDist());
        existingRace.setRaceName(updatedRace.getRaceName());

        raceRepository.save(existingRace);

        return ResponseEntity.ok("Race updated successfully");

    }
}
