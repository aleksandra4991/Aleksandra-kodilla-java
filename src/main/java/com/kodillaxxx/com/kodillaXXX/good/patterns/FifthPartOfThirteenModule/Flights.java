package com.kodillaxxx.com.kodillaXXX.good.patterns.FifthPartOfThirteenModule;

public class Flights {
    FlightFrom flightFrom;
    DirectFlightTo directFlightTo;

    public Flights(FlightFrom flightFrom, DirectFlightTo directFlightTo) {
        this.flightFrom = flightFrom;
        this.directFlightTo = directFlightTo;
    }

    public FlightFrom getFlightFrom() {
        return flightFrom;
    }

    public DirectFlightTo getDirectFlightTo() {
        return directFlightTo;
    }
}
