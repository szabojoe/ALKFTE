package com.example.runningRace.repository;

import com.example.runningRace.model.Result;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResultRepository extends JpaRepository<Result, Long> {
    List<Result> findByRaceIdOrderByResultTimeAsc(Long raceId);
}
