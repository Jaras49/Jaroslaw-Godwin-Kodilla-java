package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain
{
    public static void main(String[] args)
    {
        SimpleUser simpleUser = new SimpleUser("newUser");

        if(simpleUser.getUsername().equals("newUser"))
            System.out.println("test ok");
        else
            System.out.println("error");

        //Calculator tests
        Calculator calculator = new Calculator();
        //Addition
        System.out.println("Add method test");
        if (calculator.add(5, 5 ) == 10)
            System.out.println("test ok");
        else
            System.out.println("error");
        //Subtraction
        System.out.println("Subtract method test");
        if (calculator.subtract(10, 5 ) == 5)
            System.out.println("test ok");
        else
            System.out.println("error");
    }
}
