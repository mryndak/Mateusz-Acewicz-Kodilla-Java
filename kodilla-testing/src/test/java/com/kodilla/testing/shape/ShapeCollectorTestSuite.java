package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapes = new ShapeCollector();
        Shape square = new Square(4);
        Shape circle = new Circle(4);
        Shape triangle = new Triangle(4, 4);
        //When
        shapes.addFigure(square);
        shapes.addFigure(circle);
        shapes.addFigure(triangle);
        //Then
        Assert.assertEquals(3, shapes.size());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapes = new ShapeCollector();
        Shape square = new Square(4);
        Shape circle = new Circle(4);
        Shape triangle = new Triangle(4, 4);
        shapes.addFigure(square);
        shapes.addFigure(circle);
        shapes.addFigure(triangle);
        //When
        shapes.removeFigure(circle);
        //Then
        Assert.assertEquals(2, shapes.size());
    }

    @Test
    public void testGetFigure() {
        //Given
        Shape square = new Square(4);
        ShapeCollector shapes = new ShapeCollector();
        //When
        shapes.addFigure(square);
        //Then
        Assert.assertEquals(square, shapes.getFigure(0));
    }

    @Test
    public void testShowFigure() {
        //Given
        ShapeCollector shapes = new ShapeCollector();
        Shape square = new Square(4);
        Shape circle = new Circle(4);
        Shape triangle = new Triangle(4, 4);
        shapes.addFigure(square);
        shapes.addFigure(circle);
        shapes.addFigure(triangle);
        //When
        shapes.showFigures();
    }
}
