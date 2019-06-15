package com.kodillaxxx.com.kodillaXXX.good.patterns.FifthPartOfThirteenModule;

import java.util.Objects;

public final class FlightFrom {

    private final String cityFlightFrom;
    private final int numberOfCityFlightFrom;

    public FlightFrom(final String cityFlightFrom, final int numberOfCityFlightFrom) {
        this.cityFlightFrom = cityFlightFrom;
        this.numberOfCityFlightFrom = numberOfCityFlightFrom;
    }

    public String getCityFlightFrom() {
        return cityFlightFrom;
    }

    public int getNumberOfCityFlightFrom() {
        return numberOfCityFlightFrom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightFrom that = (FlightFrom) o;
        return numberOfCityFlightFrom == that.numberOfCityFlightFrom &&
                cityFlightFrom.equals(that.cityFlightFrom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfCityFlightFrom);
    }
}
