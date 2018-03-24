package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    World world;

    @Before
    public void setUp() throws Exception {

        List<Country> countriesEurope = new ArrayList<>();
        countriesEurope.add(new Country("England", new BigDecimal("53000000")));
        countriesEurope.add(new Country("Poland", new BigDecimal("30000000")));
        countriesEurope.add(new Country("Germany", new BigDecimal("40000000")));

        List<Country> countriesAfrica = new ArrayList<>();
        countriesAfrica.add(new Country("Egipt", new BigDecimal("35000000")));
        countriesAfrica.add(new Country("Marocco", new BigDecimal("20000000")));
        countriesAfrica.add(new Country("Algeria", new BigDecimal("25000000")));

        List<Country> countriesAmerica = new ArrayList<>();
        countriesAfrica.add(new Country("USA", new BigDecimal("100000000")));
        countriesAfrica.add(new Country("Mexico", new BigDecimal("15000000")));
        countriesAfrica.add(new Country("Canada",new BigDecimal("40000000")));

        Continent europe = new Continent("Europe", countriesEurope);
        Continent africa = new Continent("Africa", countriesAfrica);
        Continent america = new Continent("america", countriesAmerica);

        List<Continent> continents = new ArrayList<>();
        continents.add(europe);
        continents.add(africa);
        continents.add(america);

        world = new World(continents);
    }

    @Test
    public void testGetPeopleQuantity() {

        //Given
        BigDecimal expectedWorldPeopleQuantity = new BigDecimal("358000000");

        //when
        BigDecimal worldPeopleQuantity = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(expectedWorldPeopleQuantity, worldPeopleQuantity);
    }
}
