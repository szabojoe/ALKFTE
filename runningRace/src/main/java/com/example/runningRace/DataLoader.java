package com.example.runningRace;

import com.example.runningRace.model.Race;
import com.example.runningRace.model.Result;
import com.example.runningRace.model.Runner;
import com.example.runningRace.repository.RaceRepository;
import com.example.runningRace.repository.ResultRepository;
import com.example.runningRace.repository.RunnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    private RaceRepository raceRepository;

    @Autowired
    private RunnerRepository runnerRepository;

    @Autowired
    private ResultRepository resultRepository;

    @Override
    public void run(String... args) throws Exception {
        Runner runner1 = new Runner();
        runner1.setRunnerName("Bela");
        runner1.setRunnerGender("ffi");
        runner1.setRunnerAge(20);
        runnerRepository.save(runner1);

        Runner runner2 = new Runner();
        runner2.setRunnerName("Anna");
        runner2.setRunnerGender("no");
        runner2.setRunnerAge(19);
        runnerRepository.save(runner2);

        Runner runner3 = new Runner();
        runner3.setRunnerName("Pisti");
        runner3.setRunnerGender("ffi");
        runner3.setRunnerAge(29);
        runnerRepository.save(runner3);

        Runner runner4 = new Runner();
        runner4.setRunnerName("Eszter");
        runner4.setRunnerGender("no");
        runner4.setRunnerAge(15);
        runnerRepository.save(runner4);

        Race race1 = new Race();
        race1.setRaceName("Spuri");
        race1.setRaceDist(3);
        raceRepository.save(race1);

        Race race2 = new Race();
        race2.setRaceName("FutAPest");
        race2.setRaceDist(13);
        raceRepository.save(race2);

        Result result1 = new Result();
        result1.setResultParticipantId(runner1.getRunnerId());
        result1.setResultRaceId(race1.getRaceId());
        result1.setResultTime(10);
        resultRepository.save(result1);

        Result result2 = new Result();
        result2.setResultParticipantId(runner1.getRunnerId());
        result2.setResultRaceId(race2.getRaceId());
        result2.setResultTime(60);
        resultRepository.save(result2);

        Result result3 = new Result();
        result3.setResultParticipantId(runner3.getRunnerId());
        result3.setResultRaceId(race1.getRaceId());
        result3.setResultTime(9);
        resultRepository.save(result3);

        Result result4 = new Result();
        result4.setResultParticipantId(runner4.getRunnerId());
        result4.setResultRaceId(race2.getRaceId());
        result4.setResultTime(40);
        resultRepository.save(result4);
    }
}
