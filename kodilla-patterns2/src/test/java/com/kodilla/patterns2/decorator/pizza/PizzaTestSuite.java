package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaTestSuite {

    @Test
    public void basicPizzaTest() {

        //Given
        Pizza pizza = new BasicPizza();

        //When
        BigDecimal cost = pizza.getCost();
        String description = pizza.getDescription();

        //Then
        assertEquals(new BigDecimal(15), cost);
        assertEquals("Pizza: tomato sauce + cheese", description);
    }

    @Test
    public void TripleCheesePizzaTest() {

        //Given
        Pizza pizza = new BasicPizza();
        pizza = new CheeseDecorator(pizza);
        pizza = new CheeseDecorator(pizza);

        //When
        BigDecimal cost = pizza.getCost();
        String description = pizza.getDescription();

        //Then
        assertEquals(new BigDecimal(19), cost);
        assertEquals("Pizza: tomato sauce + cheese + cheese + cheese", description);
    }

    @Test
    public void decoratedPizzaTest() {

        //Given
        Pizza pizza = new BasicPizza();
        pizza = new CheeseDecorator(pizza);
        pizza = new HamDecorator(pizza);
        pizza = new MushroomsDecorator(pizza);
        pizza = new OnionDecorator(pizza);

        //When
        BigDecimal cost = pizza.getCost();
        String description = pizza.getDescription();

        //Then
        assertEquals(new BigDecimal(25), cost);
        assertEquals("Pizza: tomato sauce + cheese + cheese + ham + mushrooms + onion", description);
    }
}