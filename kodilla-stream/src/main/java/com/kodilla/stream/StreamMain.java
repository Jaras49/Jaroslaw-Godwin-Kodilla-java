package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args){
        System.out.println("Welcome to module 6 - stream");

        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example text."));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String stringToDecorate = "tekstDoDekoracji";
        System.out.println(poemBeautifier
                .beautify(stringToDecorate, (text -> "***"+text+"***")));

        System.out.println(poemBeautifier
                .beautify(stringToDecorate, (String::toUpperCase)));

        System.out.println(poemBeautifier
                .beautify(stringToDecorate, (String::toLowerCase)));

        System.out.println(poemBeautifier
                .beautify(stringToDecorate, (text -> text.replace("Do", "Po"))));

        //System.out.println("Using Stream to generate even numbers from 1 to 20");
        //NumbersGenerator.generateEven(20);

    }
}
