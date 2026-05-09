package com.tw.bootcamp.p4;

public class Attendant {
    private final ParkingFacility parkingFacility;

    public Attendant(ParkingFacility parkingFacility) {
        this.parkingFacility = parkingFacility;
    }


    public boolean park(int parkingLotNo) {
        return parkingFacility.park(parkingLotNo);
    }
}
