package com.fp;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {
    List<Integer> nNumbers(long limit) {
        return Stream.iterate(0, num -> num + 1)
                .limit(limit)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        int nNumber = 25;
        System.out.println(nNumber + " numbers as list: " + new Task5().nNumbers(nNumber));
    }
}
