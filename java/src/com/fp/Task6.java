package com.fp;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task6 {
    NumbersInfo numbersInfo(List<Integer> nums) {
        var sumsStat = nums.stream()
                .mapToInt(i -> i)
                .summaryStatistics();
        return new NumbersInfo(sumsStat.getMin(), sumsStat.getMax(), sumsStat.getSum());
    }

    public static void main(String[] args) {
        var nums = IntStream.range(3, 100).boxed().collect(Collectors.toList());
        var info = new Task6().numbersInfo(nums);
        System.out.println(nums);
        System.out.println(String.format("Min: %d\nMax: %d\nSum: %d", info.getMin(), info.getMax(), info.getSum()));
    }

    private static class NumbersInfo {
        private long min;
        private long max;
        private long sum;

        public NumbersInfo(long min, long max, long sum) {
            this.min = min;
            this.max = max;
            this.sum = sum;
        }

        public long getMin() {
            return min;
        }

        public long getMax() {
            return max;
        }

        public long getSum() {
            return sum;
        }
    }
}
