package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .map(number -> numbers[number])
                .forEach(System.out::println);

        double average = IntStream.range(0, numbers.length) //stream od zera do dlugosci tablicy
                .map(number -> numbers[number])
                .average()
                .orElse(0.0);

        return average;
    }
}
