package com.kodilla.exception.test;

import java.util.HashMap;

public class AirportApp {

    public static void main(String[] args) {

        HashMap<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("London", true);
        flightMap.put("Berlin", true);
        flightMap.put("New York", false);
        flightMap.put("Chicago", false);

        FindFlightLogic findFlightLogic = new FindFlightLogic(flightMap);
        Flight toBerlin = new Flight("London", "Berlin");
        Flight toNewYork = new Flight("Berlin" , "New York");
        Flight toWarsaw = new Flight("Berlin", "Warsaw");

        try {

            System.out.println(findFlightLogic.findFlight(toBerlin));
            System.out.println(findFlightLogic.findFlight(toNewYork));
            System.out.println(findFlightLogic.findFlight(toWarsaw));

        } catch (RouteNotFoundException e){
            System.out.println("No flight available");

        }finally {
            System.out.println("Have a nice day !");
        }
    }
}
