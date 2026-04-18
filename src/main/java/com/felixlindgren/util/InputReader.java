package com.felixlindgren.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class InputReader {
    public static List<String> readLines(String fileName) {
        InputStream inputStream = InputReader.class
                .getClassLoader()
                .getResourceAsStream(fileName);

        if (inputStream == null) {
            throw new RuntimeException("Resource not found: " + fileName);
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            return reader.lines().toList();
        } catch (IOException e) {
            throw new RuntimeException("Could not read file: " + e);
        }
    }
}
