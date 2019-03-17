package com.kodilla.testing.shape;

public class Triangle implements Shape {
    public String name;
    public double sideLength;
    public double heigth;

    public Triangle(double sideLength, double heigth) {
        this.sideLength = sideLength;
        this.heigth = heigth;
        this.name = "Triangle";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return heigth * sideLength / 2;
    }
}
