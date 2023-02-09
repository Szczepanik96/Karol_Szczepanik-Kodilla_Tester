package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightRepository {
    static Map<String, List<Flight>> flightRepository = new HashMap<>();

    public static void addFlight(String airportName, Flight flight) {
        List<Flight> flights = flightRepository.getOrDefault(airportName, new ArrayList<>());
        flights.add(flight);
        flightRepository.put(airportName, flights);
    }

    public static List<Flight> getFlightTable(String name) {
        return flightRepository.getOrDefault(name, new ArrayList<>());
    }
}