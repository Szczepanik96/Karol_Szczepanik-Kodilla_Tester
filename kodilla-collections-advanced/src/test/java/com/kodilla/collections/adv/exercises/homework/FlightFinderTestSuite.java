package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void findFlightsFromTest() {
        FlightFinder flightFinder = new FlightFinder();

        FlightRepository.addFlight("Luton Airport", new Flight("England", "Canada"));
        FlightRepository.addFlight("Luton Airport", new Flight("England", "Bahamas"));
        FlightRepository.addFlight("Luton Airport", new Flight("England", "Germany"));
        FlightRepository.addFlight("Balice Airport", new Flight("Poland", "China"));
        FlightRepository.addFlight("Balice Airport", new Flight("Poland", "Brazil"));
        FlightRepository.addFlight("Balice Airport", new Flight("Poland", "Spain"));
        FlightRepository.addFlight("Hartsfield", new Flight("USA", "Ukraine"));
        FlightRepository.addFlight("Hartsfield", new Flight("USA", "Republic of Check"));
        FlightRepository.addFlight("Hartsfield", new Flight("USA", "Finland"));

        List<Flight> result = flightFinder.findFlightFrom("Poland");
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Poland", "China"));
        expectedList.add(new Flight("Poland", "Brazil"));
        expectedList.add(new Flight("Poland", "Spain"));
        assertEquals(3, result.size());
    }
    @Test
    public void findFlightsToTest() {
        FlightFinder flightFinder = new FlightFinder();

        FlightRepository.addFlight("Luton Airport", new Flight("England", "Ukraine"));
        FlightRepository.addFlight("Luton Airport", new Flight("England", "Bahamas"));
        FlightRepository.addFlight("Luton Airport", new Flight("England", "Germany"));
        FlightRepository.addFlight("Balice Airport", new Flight("Poland", "Ukraine"));
        FlightRepository.addFlight("Balice Airport", new Flight("Poland", "Brazil"));
        FlightRepository.addFlight("Balice Airport", new Flight("Poland", "Spain"));
        FlightRepository.addFlight("Hartsfield", new Flight("USA", "Ukraine"));
        FlightRepository.addFlight("Hartsfield", new Flight("USA", "Republic of Check"));
        FlightRepository.addFlight("Hartsfield", new Flight("USA", "Finland"));

        List<Flight> result = flightFinder.findFlightsTo("Ukraine");
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("England", "Ukraine"));
        expectedList.add(new Flight("Poland", "Ukraine"));
        expectedList.add(new Flight("USA", "Ukraine"));
        assertEquals(3, result.size());
    }
}