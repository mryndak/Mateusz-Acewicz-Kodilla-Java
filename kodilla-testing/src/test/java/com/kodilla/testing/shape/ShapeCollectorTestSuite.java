package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapes = new ShapeCollector();
        Square square = new Square(4);
        int size = shapes.size();
        //When
        shapes.addFigure(square);
        //Then
        Assert.assertEquals(size+1, shapes.size());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        Square square = new Square(4);
        ShapeCollector shapes = new ShapeCollector();
        shapes.addFigure(square);
        int size = shapes.size();
        //When
        shapes.removeFigure(square);
        //Then
        Assert.assertEquals(size-1, shapes.size());
    }

    @Test
    public void testGetFigure() {
        //Given
        Square square = new Square(4);
        ShapeCollector shapes = new ShapeCollector();
        //When
        shapes.addFigure(square);
        //Then
        Assert.assertEquals(square, shapes.getFigure(0));
    }
}
