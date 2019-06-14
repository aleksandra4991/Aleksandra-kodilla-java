package com.kodillaxxx.com.kodillaXXX.exception;

public class ExceptionModuleRunner {

    public static void main (String args[]){

        FlightFounder flightFounder = new FlightFounder();
        Flight flight = new Flight("Paris","Barcelona");

        try{
            flightFounder.findFlight(flight);
        }
        catch(RouteNotFoundException e ){
            System.out.println("There is no such a flight in database");
        }
    }
}
