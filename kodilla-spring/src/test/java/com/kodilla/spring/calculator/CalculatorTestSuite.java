package com.kodilla.spring.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double add = calculator.add(5, 5);
        double sub = calculator.sub(5.5, 2);
        double mul = calculator.mul(5.1, 2);
        double div = calculator.div(2.8, 2);
        double div1 = calculator.div(2.8, 0);

        //Then
        assertEquals(10, add, 0);
        assertEquals(3.5, sub, 0);
        assertEquals(10.2, mul, 0);
        assertEquals(1.4, div, 0);
        assertEquals(0, div1, 0);
    }
}
