package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle(10);

        //When
        shapeCollector.addFigure(shape);

        //Then
        Assert.assertEquals(shape, shapeCollector.getFigure(0));
    }
    @Test
    public void testRemoveFigureNotExisting(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle(10);

        //When
        boolean result = shapeCollector.removeFigure(shape);

        //then
        Assert.assertFalse(result);

    }
    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle(10);
        shapeCollector.addFigure(shape);

        //When
        shapeCollector.removeFigure(shape);

        //Then
        Assert.assertThat(shapeCollector.getSize(), is(0));

    }
    @Test
    public void testShowFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(10);
        Triangle triangle = new Triangle(10, 10);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        String expected = circle.getShapeName() + " " + circle.getField() +", " + triangle.getShapeName() + " " + triangle.getField();

        //When
        String result = shapeCollector.showFigures();

        //Then
        Assert.assertEquals(expected, result);
    }
}
