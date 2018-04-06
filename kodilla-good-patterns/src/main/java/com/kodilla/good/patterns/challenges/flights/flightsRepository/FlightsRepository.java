package com.kodilla.good.patterns.challenges.flights.flightsRepository;

import com.kodilla.good.patterns.challenges.flights.Flight;

import java.util.HashSet;
import java.util.Set;

//Gets flights list from database
public class FlightsRepository implements Repository {

    @Override
    public Set<Flight> getFlights() {

        Set<Flight> flightList = new HashSet<>();
        flightList.add(new Flight("Gdańsk", "Wrocław"));
        flightList.add(new Flight("Gdańsk", "Bytów"));
        flightList.add(new Flight("Wrocław", "Gdańsk"));
        flightList.add(new Flight("Katowice", "Gdańsk"));
        flightList.add(new Flight("Bytów", "Katowice"));
        flightList.add(new Flight("Wrocław", "Katowice"));

        return flightList;
    }


}
