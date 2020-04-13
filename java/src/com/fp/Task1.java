package com.fp;

import java.util.List;
import java.util.function.Predicate;

public class Task1 {
    void testElements(List<Integer> nums, Predicate<Integer> pred) {
        nums.stream().filter(pred).forEach(System.out::println);
    }

    public static void main(String[] args) {
        var nums = List.of(1,2,3,4,5,6,7,8,9,0,10);
        new Task1().testElements(nums, num -> (num & 1) == 0 && num > 7);
        Predicate<Integer> p;
    }
}
