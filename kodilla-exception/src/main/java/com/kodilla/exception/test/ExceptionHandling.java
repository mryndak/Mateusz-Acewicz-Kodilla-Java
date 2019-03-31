package com.kodilla.exception.test;

public class ExceptionHandling extends Exception {

    public static void main(String[] args) {
        SecondChallenge challenge = new SecondChallenge();
        try {
            String s = challenge.probablyIWillThrowException(1, 1.5);
            System.out.println(s);
        } catch (Exception e) {
            System.out.println("Problem encountered.");
        }
    }
}
