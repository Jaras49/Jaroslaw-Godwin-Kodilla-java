package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent> continents;

    public World(){

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

        continents = new ArrayList<>();
        continents.add(europe);
        continents.add(africa);
        continents.add(america);
    }

    public BigDecimal getPeopleQuantity(){
        return continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPopulation)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
