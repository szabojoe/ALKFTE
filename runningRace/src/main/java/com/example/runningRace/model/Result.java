package com.example.runningRace.model;

import jakarta.persistence.*;

@Entity
@Table(name = "results")
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long resultId;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("runnerId")
    private Runner runner;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("raceId")

    private Race race;

    @Column(name = "time_minutes", nullable = false)
    private double resultTime;
    private Long runnerId;
    private Long raceId;

    public String getRunnerName(){
        return runner.getRunnerName();
    }

    public Long getResultId() {
        return resultId;
    }

    public void setResultId(Long resultId) {
        this.resultId = resultId;
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

    public double getResultTime() {
        return resultTime;
    }

    public void setResultTime(double resultTime) {
        this.resultTime = resultTime;
    }

    public void setResultParticipantId(Long runnerId) {
        this.runnerId = runnerId;
    }

    public void setResultRaceId(Long raceId) {
        this.raceId = raceId;
    }
}
