package com.fp;

import java.util.List;

public class Task4 {
    long countEmptyLines(List<String> lines) {
        return lines.stream()
                .filter(s -> s.isEmpty())
                .count();
    }

    public static void main(String[] args) {
        var lines = List.of("something", "", "", "not empty", "");
        System.out.println("Empty lines: " + new Task4().countEmptyLines(lines));
    }
}
