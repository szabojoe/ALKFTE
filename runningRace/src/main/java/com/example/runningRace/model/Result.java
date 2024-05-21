package com.example.runningRace.model;

import jakarta.persistence.*;

@Entity
@Table(name = "results")
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long resultId;
    private double resultTime;
    private Long runnerId;
    private Long raceId;

    public Long getResultId() {
        return resultId;
    }

    public void setResultId(Long resultId) {
        this.resultId = resultId;
    }

    public double getResultTime() {
        return resultTime;
    }

    public void setResultTime(double resultTime) {
        this.resultTime = resultTime;
    }

    public Long getRunnerId() {
        return runnerId;
    }

    public void setRunnerId(Long runnerId) {
        this.runnerId = runnerId;
    }

    public Long getRaceId() {
        return raceId;
    }

    public void setRaceId(Long raceId) {
        this.raceId = raceId;
    }
}
