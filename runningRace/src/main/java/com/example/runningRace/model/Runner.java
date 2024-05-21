package com.example.runningRace.model;

import jakarta.persistence.*;

@Entity
public class Runner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long runnerId;

    @Column(name = "runnerName")
    private String runnerName;

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
