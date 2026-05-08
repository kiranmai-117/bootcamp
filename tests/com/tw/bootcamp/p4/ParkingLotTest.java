package com.tw.bootcamp.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParkingLotTest {
    @Test
    void shouldParkACar() {
        ParkingLot parkingLot = new ParkingLot(10);
        assertTrue(parkingLot.park());
    }
}
