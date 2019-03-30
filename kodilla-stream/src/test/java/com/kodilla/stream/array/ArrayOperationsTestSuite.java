package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[] {9, 10, 10, 10, 10, 5, 6, 9, 9, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        //When
        double result = getAverage(numbers);

        //Then
        Assert.assertEquals(12.1, result, 0.01);
    }
}
