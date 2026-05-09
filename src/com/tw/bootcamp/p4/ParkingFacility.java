package com.tw.bootcamp.p4;

import java.util.Objects;

public class ParkingFacility {
    private final int noOfLots;
    private final int size;
    private final ParkingLots parkingLots;

    private ParkingFacility(int noOfLots, int size, ParkingLots parkingLots) {
        this.noOfLots = noOfLots;
        this.parkingLots = parkingLots;
        this.size = size;
    }

    public static ParkingFacility create(int noOfLots, int size) {
        ParkingLots parkingLots = ParkingLots.create(noOfLots, size);
        return new ParkingFacility(noOfLots, size, parkingLots);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ParkingFacility that = (ParkingFacility) o;
        return noOfLots == that.noOfLots && size == that.size && Objects.equals(parkingLots, that.parkingLots);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noOfLots, size, parkingLots);
    }
}
