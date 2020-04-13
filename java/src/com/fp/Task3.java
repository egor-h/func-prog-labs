package com.fp;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Task3 {
    long sum(List<Integer> nums) {
        return nums.stream()
                .reduce(0, (acc, val) -> val * val + acc)
                .longValue();
    }

    long sumOld(List<Integer> nums) {
        int sum = 0;
        for (Integer n : nums) {
            int x = n * n;
            sum = sum + x;
        }
        return sum;
    }

    public static void main(String[] args) {
        var nums = IntStream.range(0, 20).boxed().collect(Collectors.toList());
        var task3 = new Task3();
        boolean numbersAreSame = task3.sum(nums) == task3.sumOld(nums);

        System.out.println("Numbers are same? " + numbersAreSame);
    }
}
