package com.felixlindgren.day6;

import java.util.*;

public class Day6 {

    public long solvePart1(List<String> input) {
        List<Race> races = parsePart1(input);

        long totalWaysToWin = 1;
        for (Race race : races) {
            totalWaysToWin *= countWaysToWin(race);
        }
        return totalWaysToWin;
    }

    public long solvePart2(List<String> input) {
        Race race = parsePart2(input);
        return countWaysToWin(race);
    }

    private List<Race> parsePart1(List<String> input) {
        String[] times = input.get(0)
                .replace("Time:", "")
                .trim()
                .split("\\s+");

        String[] distances = input.get(1)
                .replace("Distance:", "")
                .trim()
                .split("\\s+");

        List<Race> races = new ArrayList<>();
        for (int i = 0; i < times.length; i++) {
            races.add(new Race(
                Long.parseLong(times[i]),
                Long.parseLong(distances[i])
            ));
        }
        return races;
    }

    private Race parsePart2(List<String> input) {
         String time = input.get(0)
                .replace("Time:", "")
                .replaceAll("\\s+", "");

        String distance = input.get(1)
                .replace("Distance:", "")
                .replaceAll("\\s+", "");

        return new Race(
                Long.parseLong(time),
                Long.parseLong(distance)
        );
    }
    
    private long countWaysToWin(Race race) {
        long raceTime = race.time();
        long recordDistance = race.distance();

        long waysToWin = 0;
        for (long holdTime = 0; holdTime <= raceTime; holdTime++) {
            long speed = holdTime; // Not nessasary, but might be more explanatory?
            long calculatedDistance = speed * (raceTime - holdTime);
            if (calculatedDistance > recordDistance) {
                waysToWin++;
            }
        }

        return waysToWin;
    }
}