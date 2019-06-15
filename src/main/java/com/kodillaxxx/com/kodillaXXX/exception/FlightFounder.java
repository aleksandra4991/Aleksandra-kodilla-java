package com.kodillaxxx.com.kodillaXXX.exception;


import java.util.HashMap;
import java.util.Map;

public class FlightFounder {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> mapOfFlights = new HashMap<String, Boolean>();
        mapOfFlights.put("Barcelona", false);

        for (Map.Entry<String, Boolean> entry : mapOfFlights.entrySet()) {
            if (entry.getKey().equals(flight.getArrivalAirport()) && entry.getValue().equals(true)) {
                System.out.println("Wybrałeś lotnisko docelowe: " + entry.getKey());
            } else {
                throw new RouteNotFoundException("Niestety nie latamy na wybrane lotnisko docelowe");
            }
        }
    }
}
