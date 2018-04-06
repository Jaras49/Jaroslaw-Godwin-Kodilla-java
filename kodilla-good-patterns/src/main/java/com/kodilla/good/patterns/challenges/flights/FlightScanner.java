package com.kodilla.good.patterns.challenges.flights;

import com.kodilla.good.patterns.challenges.flights.flightsRepository.Repository;

import java.util.Set;
import java.util.stream.Collectors;

public class FlightScanner {
    private Repository repository;

    public FlightScanner(Repository repository) {
        this.repository = repository;

    }

    public String getAllFlightsFrom(String city) {

        return "Available flights from " + city + ":\n" +
                repository.getFlights().stream()
                .filter(n -> n.getDeparture().equals(city))
                .map(n -> n.getDeparture() + " " + n.getArrival())
                .collect(Collectors.joining("\n"));
    }

    public String getAllFlightsTo(String city) {

        return "Available flights to " + city + ":\n" +
                repository.getFlights().stream()
                .filter(n -> n.getArrival().equals(city))
                .map(n -> n.getDeparture() + " " + n.getArrival())
                .collect(Collectors.joining("\n"));
    }

    public String getFlightsFromViaTo(String from, String arrival) {

        Set<Flight> set = repository.getFlights().stream()
                .filter(n -> n.getDeparture().equals(from))
                .collect(Collectors.toSet());

        Set<Flight> set1 = repository.getFlights().stream()
                .filter(n -> n.getArrival().equals(arrival))
                .collect(Collectors.toSet());

        return "You can fly from " + from + " " + "to " + arrival + " via:\n" +
                set.stream()
                .map(n -> n.getArrival())
                .filter(n -> set1.stream()
                        .map(x -> x.getDeparture())
                        .collect(Collectors.toSet())
                        .contains(n))
                .collect(Collectors.joining("\n"));
    }
}
