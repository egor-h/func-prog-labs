package com.fp;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task8 {
    <T, R> List<R> map(List<T> list, Function<T, R> func) {
        return list.stream()
                .map(func)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        var nums = IntStream.range(-3, 3).boxed().collect(Collectors.toList());
        System.out.println(nums);
        System.out.println(new Task8().map(nums, n -> n < 0 ? false : true));
    }
}
