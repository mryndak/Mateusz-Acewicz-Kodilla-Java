package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<>();
        boolean exists = false;

        flights.put("Warsaw", true);
        flights.put("London", true);
        flights.put("Tokyo", false);
        flights.put("Paris", false);
        flights.put("New York", true);
        flights.put("Berlin", true);

        for(Map.Entry<String, Boolean> entry : flights.entrySet()) {
            //System.out.println(entry.getKey() + " " + entry.getValue());
            if(flight.getArrivalAirport().equals(entry.getKey())) {
                if(entry.getValue() == true) {
                    System.out.println("Flight found.");
                } else {
                    System.out.println("Airport closed at the moment.");
                }
                exists = true;
                break;
            }
        }
        if(exists == false) {
            throw new RouteNotFoundException();
        }
    }
}
