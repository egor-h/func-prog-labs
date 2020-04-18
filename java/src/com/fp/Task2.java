package com.fp;

import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    List<String> sortAndToUpperCase(List<String> lines) {
        return lines.stream()
                .sorted()
                .map(line -> line.toUpperCase())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        var lines = List.of("some", "lowercased", "lines", "here");
        new Task2().sortAndToUpperCase(lines).stream().forEach(System.out::println);
    }
}
