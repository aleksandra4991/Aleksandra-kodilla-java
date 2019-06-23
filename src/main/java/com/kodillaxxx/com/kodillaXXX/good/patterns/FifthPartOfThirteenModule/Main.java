package com.kodillaxxx.com.kodillaXXX.good.patterns.FifthPartOfThirteenModule;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        System.out.println("Z Warszawy możesz lecieć bezpośrednio do:");
        CombinationOfFlightsFromFewCities.getList()
                .stream()
                .filter(e -> e.getFlightFrom().getCityFlightFrom().equals("Warsaw"))
                .map(directFlightTo -> directFlightTo.getDirectFlightTo().getDirectCityFlightTo())
                .forEach(System.out::println);

        System.out.println("Do Lublany możesz lecieć bezpośrednio z:");
        CombinationOfFlightsFromFewCities.getList()
                .stream()
                .filter(e -> e.getDirectFlightTo().getDirectCityFlightTo().equals("Lublana"))
                .map(flights -> flights.getFlightFrom().getCityFlightFrom())
                .forEach(System.out::println);

        List<String> flightsFromWarsaw = CombinationOfFlightsFromFewCities.getList()
                .stream()
                .filter(e -> e.getFlightFrom().getCityFlightFrom().equals("Warsaw"))
                .map(directFlightTo -> directFlightTo.getDirectFlightTo().getDirectCityFlightTo())
                .collect(Collectors.toList());

        List<String> flightsToLublana = CombinationOfFlightsFromFewCities.getList()
                .stream()
                .filter(e -> e.getDirectFlightTo().getDirectCityFlightTo().equals("Lublana"))
                .map(flights -> flights.getFlightFrom().getCityFlightFrom())
                .collect(Collectors.toList());

        for (String flightFROMWarsaw :flightsFromWarsaw) {
            for (String flightTOLublana : flightsToLublana) {
                if (flightFROMWarsaw.equals(flightTOLublana)) {

                    System.out.println("Z Warszawy do Lublany,możesz polecieć z przesiadką w: " + flightFROMWarsaw);
                }
            }
        }
    }
}