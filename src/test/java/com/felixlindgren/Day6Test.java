package com.felixlindgren;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.List;
import com.felixlindgren.day6.Day6;

public class Day6Test 
{
    @Test
    public void Part1Test() {
        List<String> input = List.of(
                "Time:        56     71     79     99",
                "Distance:   334   1135   1350   2430"
        );

        Day6 solver = new Day6();

        long result = solver.solvePart1(input);

        assertEquals(211904, result);
    }

    @Test
    public void Part2Test() {
                List<String> input = List.of(
                "Time:        56     71     79     99",
                "Distance:   334   1135   1350   2430"
        );

        Day6 solver = new Day6();

        long result = solver.solvePart2(input);

        assertEquals(43364472, result);
    }
}