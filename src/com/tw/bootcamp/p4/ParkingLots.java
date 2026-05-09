package com.tw.bootcamp.p4;

import java.util.ArrayList;

public class ParkingLots extends ArrayList<ParkingLot> {
    public static ParkingLots create(int noOfLots, int size) {
        ParkingLots parkingLots = new ParkingLots();

        for (int i = 0; i < noOfLots; i++) {
            parkingLots.add(new ParkingLot(size));
        }

        return parkingLots;
    }


}
