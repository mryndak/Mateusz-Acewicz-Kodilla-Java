package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }

    public Shape getFigure(int i) {
        return shapes.get(i);
    }

    public void showFigures() {
        for(Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    public int size() {
        return shapes.size();
    }
}
