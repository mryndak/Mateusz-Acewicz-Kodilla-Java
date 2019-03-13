package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class OddNumbersExterminator {
    private ArrayList<Integer> evenList = new ArrayList<>();

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        for(Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext(); ) {
            int number = iterator.next();
            if(number % 2 == 0) {
                evenList.add(number);
            }
        }

        return evenList;
    }
}
