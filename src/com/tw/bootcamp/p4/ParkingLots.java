package com.tw.bootcamp.p4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ParkingLots {
    private final List<ParkingLot> parkingLots;

    public ParkingLots(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public static ParkingLots create(int noOfLots, int size) {
        List<ParkingLot> pLots = new ArrayList<>();

        for (int i = 0; i < noOfLots; i++) {
            addParkingLot(size, pLots);
        }

        return new ParkingLots(pLots);
    }

    private static void addParkingLot(int size, List<ParkingLot> pLots) {
        pLots.add(new ParkingLot(size));
    }


    public boolean park(int parkingLotNo) {
        return parkingLots.get(parkingLotNo).park();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ParkingLots that = (ParkingLots) o;
        return Objects.equals(parkingLots, that.parkingLots);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(parkingLots);
    }
}
