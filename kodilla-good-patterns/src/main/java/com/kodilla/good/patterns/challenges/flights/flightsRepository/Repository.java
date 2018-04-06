package com.kodilla.good.patterns.challenges.flights.flightsRepository;

import com.kodilla.good.patterns.challenges.flights.Flight;

import java.util.Set;

//Gets flights list from database
public interface Repository {

    Set<Flight> getFlights();
}
