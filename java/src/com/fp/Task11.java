package com.fp;

import java.util.List;
import java.util.stream.Collectors;Ф
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task11 {

    Stream<Integer> base() {
        return Stream.iterate(0, n -> n + 1).limit(10_000_000);
    }

    List<Integer> div7() {
        return base().filter(n -> n % 7 == 0).collect(Collectors.toList());
    }

    List <Integer> div7Parallel() {
        return base().parallel().filter(n -> n % 7 == 0).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        var task = new Task11();
        long before = System.nanoTime();
        task.div7Parallel();
        System.out.println(System.nanoTime() - before);
    }
}
