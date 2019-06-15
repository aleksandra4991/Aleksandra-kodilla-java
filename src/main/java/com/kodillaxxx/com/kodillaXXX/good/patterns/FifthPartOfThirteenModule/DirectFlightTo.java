package com.kodillaxxx.com.kodillaXXX.good.patterns.FifthPartOfThirteenModule;

import java.util.Objects;

public final class DirectFlightTo {

    private final String directCityFlightTo;
    private final int numberOfCityFlightTo;

    public DirectFlightTo(final String directCityFlightTo, final int numberOfCityFlightTo) {
        this.directCityFlightTo = directCityFlightTo;
        this.numberOfCityFlightTo = numberOfCityFlightTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DirectFlightTo that = (DirectFlightTo) o;
        return numberOfCityFlightTo == that.numberOfCityFlightTo &&
                directCityFlightTo.equals(that.directCityFlightTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfCityFlightTo);
    }

    @Override
    public String toString() {
        return "Bezpośrednie loty do:" + directCityFlightTo + '\'' +
                '}';
    }

    public String getDirectCityFlightTo() {
        return directCityFlightTo;
    }
}
