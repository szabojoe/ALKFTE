package com.example.runningRace.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
public class Race {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long raceId;

    private int raceDist;

    private String raceName;

    @OneToMany(mappedBy = "race",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<Result> results = new ArrayList<>();

    @OneToMany(mappedBy = "race")
    private Set<Result> result;

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public Set<Result> getResult() {
        return result;
    }

    public void setResult(Set<Result> result) {
        this.result = result;
    }

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