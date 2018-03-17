package com.kodilla.testing.shape;

public class Square implements Shape {

    private String shapeName = "Square";
    private double a;
    private double b;

    public Square(double a, double b){
        this.a = a;
        this.b = b;
    }
    @Override
    public String getShapeName() {
        return shapeName;
    }
    @Override
    public double getField(){

        return 100;
    }

    @Override
    public String toString() {
        return "Square{" +
                "shapeName='" + shapeName + '\'' +
                ", a=" + a +
                ", b=" + b +
                '}';
    }
}
