package com.kodilla.good.patterns.challenges.flights;

import com.kodilla.good.patterns.challenges.flights.flightsRepository.FlightsRepository;

public class AirScannerApp {

    public static void main(String[] args) {

        FlightScanner flightScanner = new FlightScanner(new FlightsRepository());

        System.out.println(flightScanner.getAllFlightsFrom("Gdańsk"));
        System.out.println(flightScanner.getAllFlightsTo("Katowice"));
        System.out.println(flightScanner.getFlightsFromViaTo("Gdańsk", "Katowice"));
    }
}
