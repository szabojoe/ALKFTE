package com.example.runningRace.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Race {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long raceId;
    private int raceDist;
    private String raceName;

    public Long getRaceId() {
        return raceId;
    }

    public void setRaceId(Long raceId) {
        this.raceId = raceId;
    }

    public int getRaceDist() {
        return raceDist;
    }

    public void setRaceDist(int raceDist) {
        this.raceDist = raceDist;
    }

    public String getRaceName() {
        return raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }
}