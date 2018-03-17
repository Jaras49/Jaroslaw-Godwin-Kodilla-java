package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String shapeName = "Circle";
    private double r;

    public Circle(double r){
        this.r = r;
    }
    @Override
    public String getShapeName() {
        return shapeName;
    }
    @Override
    public double getField(){

        return 100;
    }
}
