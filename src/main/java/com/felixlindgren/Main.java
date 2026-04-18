package com.felixlindgren;

import com.felixlindgren.day6.Day6;
import com.felixlindgren.util.InputReader;

public class Main {
    public static void main(String[] args) {
        var input = InputReader.readLines("day6.txt");

        Day6 solver = new Day6();

        System.out.println("Part 1 answer: " + solver.solvePart1(input));
        System.out.println("Part 2 answer: " + solver.solvePart2(input));
    }
}