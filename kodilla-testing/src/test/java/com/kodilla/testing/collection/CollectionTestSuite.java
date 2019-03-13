package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }

    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        //When
        resultList = exterminator.exterminate(emptyList);
        System.out.println("Testing empty list");
        //Then
        Assert.assertTrue(resultList.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> testList = new ArrayList<Integer>();
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        boolean result = true;
        for(int i = 0; i < 10; i++) {
            testList.add(i);
        }
        //When
        resultList = exterminator.exterminate(testList);
        System.out.println("Testing normal list");
        //Then
        for(Iterator<Integer> iterator = resultList.iterator(); iterator.hasNext(); ) {
            int number = iterator.next();
            if(number % 2 == 1) {
                result = false;
                break;
            }
        }
        Assert.assertTrue(result);
    }
}
