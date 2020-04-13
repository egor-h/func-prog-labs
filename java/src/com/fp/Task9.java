package com.fp;

import java.util.List;
import java.util.stream.Collectors;

public class Task9 {
    String makeString(List<Integer> nums) {
        return nums.stream().map(n -> (n & 1) == 1 ? "o"+n : "e"+n).collect(Collectors.joining(","));
    }
    public static void main(String[] args) {
        var nums = List.of(3, 44, 55, 66, 77);
        System.out.println(nums);
        System.out.println(new Task9().makeString(nums));
    }
}
