package com.kodilla.exception.test;

public class FlightSystem {

    public static void main(String[] args) {

        Flight flight1 = new Flight("Warsaw", "London");
        Flight flight2 = new Flight("Sydney", "Tokyo");
        Flight flight3 = new Flight("London", "Sydney");

        FlightSearch flightSearch = new FlightSearch();

        try {
            flightSearch.findFlight(flight3);
        } catch (RouteNotFoundException e) {
            System.out.println("The are no flights to that airport. Sorry.");
        } finally {
            System.out.println("Thank you for using our system.");
        }
    }
}
