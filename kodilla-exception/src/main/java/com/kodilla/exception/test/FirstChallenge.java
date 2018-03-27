package com.kodilla.exception.test;

import javax.swing.*;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {


        try {
            if(b == 0)
                throw new ArithmeticException();
                return  a / b;

        } catch (ArithmeticException e) {

                JOptionPane.showMessageDialog(null, " Nie dziel przez 0 cholero");
        } finally {
            JOptionPane.showMessageDialog(null, "Try one more time");
        }
        return 0;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

    }
}
