package com.kodillaxxx.com.kodillaXXX.good.patterns.FifthPartOfThirteenModule;

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
                .filter(e->e.getDirectFlightTo().getDirectCityFlightTo().equals("Lublana"))
                .map(flights -> flights.getFlightFrom().getCityFlightFrom())
                .forEach(System.out::println);

        //CombinationOfFlightsFromFewCities.getList()
          //      .stream()
            //    .allMatch(flights -> flights.getFlightFrom().getCityFlightFrom().equals("Warszawa")&&(flights.getDirectFlightTo().getDirectCityFlightTo().equals("Lublana")))

        }

    }

