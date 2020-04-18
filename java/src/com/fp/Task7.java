package com.fp;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task7 {
    List<Integer> modifyNumbers(List<Integer> nums) {
        return nums.stream()
                .map(n -> n > 0 ? n * n : Math.abs(n))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        var nums = IntStream.range(-3, 3).boxed().collect(Collectors.toList());
        System.out.println(nums);
        System.out.println(new Task7().modifyNumbers(nums));
    }
}
