package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String name;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.name = "Circle";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }
}
