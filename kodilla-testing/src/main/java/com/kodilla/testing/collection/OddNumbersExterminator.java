package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        for(Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext(); ) {
            int number = iterator.next();
            if(number % 2 == 1) {
                iterator.remove();
            }
        }

        return numbers;
    }
}
