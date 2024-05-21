package com.example.runningRace.model;

import jakarta.persistence.*;

@Entity
public class Runner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long runnerId;

    @Column(name = "runnerName")
    private String runnerName;

    private String runnerGender;
    private int runnerAge;

    public String getRunnerGender() {
        return runnerGender;
    }

    public void setRunnerGender(String runnerGender) {
        this.runnerGender = runnerGender;
    }

    public int getRunnerAge() {
        return runnerAge;
    }

    public void setRunnerAge(int runnerAge) {
        this.runnerAge = runnerAge;
    }

    public Long getRunnerId() {
        return runnerId;
    }

    public void setRunnerId(Long runnerId) {
        this.runnerId = runnerId;
    }

    public String getRunnerName() {
        return runnerName;
    }

    public void setRunnerName(String runnerName) {
        this.runnerName = runnerName;
    }
}
