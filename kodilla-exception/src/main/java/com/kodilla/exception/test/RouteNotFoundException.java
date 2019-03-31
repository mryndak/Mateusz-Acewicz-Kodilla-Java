package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {
    public RouteNotFoundException() {
        super("No route like that exist");
    }
}
