package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FlightFinder {
    public List<Flight> findFlightFrom(String departure) {
        List<Flight> flightsFrom = new ArrayList<>();

        for (Map.Entry<String, List<Flight>> from : FlightRepository.flightRepository.entrySet()) {
            for (Flight flight : from.getValue()) {
                if (flight.departure.equals(departure)) {
                    flightsFrom.add(flight);
                }
            }
        }
        return flightsFrom;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> flightTo = new ArrayList<>();

        for (Map.Entry<String, List<Flight>> to : FlightRepository.flightRepository.entrySet()) {
            for (Flight flight : to.getValue()) {
                if (flight.arrival.equals(arrival)) {
                    flightTo.add(flight);
                }
            }
        }
        return flightTo;
    }
}