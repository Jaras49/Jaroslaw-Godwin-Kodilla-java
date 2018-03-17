package com.kodilla.testing;

import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Triangle;

public class TestingMain
{
    public static void main(String[] args)
    {
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle(10));
        shapeCollector.addFigure(new Triangle(10, 10));


    }
}
