package com.kodilla.exception.test;

import java.util.HashMap;

public class FindFlightLogic  {

    private HashMap<String, Boolean> flightMap;

    public FindFlightLogic(HashMap<String, Boolean> flightMap) {
        this.flightMap = flightMap;
    }

    public String findFlight(Flight flight) throws RouteNotFoundException {

        if (flightMap.containsKey(flight.getArrivalAirport())) {

            if (flightMap.get(flight.getArrivalAirport()))
            return "Flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " is available";

            else {
                return "Flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " is not available";
            }
        }
        throw new RouteNotFoundException("Route not found");
    }
}
