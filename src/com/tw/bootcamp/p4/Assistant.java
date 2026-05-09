package com.tw.bootcamp.p4;

public class Assistant {
    private final ParkingFacility parkingFacility;

    public Assistant(ParkingFacility parkingFacility) {
        this.parkingFacility = parkingFacility;
    }

    public void display() {
        System.out.println(parkingFacility);
    }
}
