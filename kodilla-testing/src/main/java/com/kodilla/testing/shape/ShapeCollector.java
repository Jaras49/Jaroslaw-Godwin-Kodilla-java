package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.StringJoiner;

public class ShapeCollector {

    private ArrayList<Shape> shapes;

    public ShapeCollector(){
        shapes = new ArrayList<>();
    }

    public void addFigure(Shape shape){
        shapes.add(shape);
    }
    public boolean removeFigure(Shape shape){

        if(shapes.contains(shape)){
            shapes.remove(shape);
            return true;
        }
        return false;
    }
    public Shape getFigure(int n){

        return shapes.get(n);
    }
    public String showFigures(){

        StringJoiner stringJoiner = new StringJoiner(", ");

        for(Shape s: shapes){
            stringJoiner.add(s.getShapeName()+ " " + s.getField());
        }
        return stringJoiner.toString();
    }
    public int getSize(){
        return shapes.size();
    }
}
