package com.kodilla.testing.shape;

public class Square implements Shape {
    private double sideLength;
    private String name;


    public Square(double sideLength) {
        this.sideLength = sideLength;
        this.name = "Square";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }
}
