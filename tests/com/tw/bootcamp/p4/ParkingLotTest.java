package com.tw.bootcamp.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParkingLotTest {
    @Test
    void shouldParkACar() {
        ParkingLot parkingLot = new ParkingLot(10);
        assertTrue(parkingLot.park());
    }

    @Test
    void shouldTellWhetherParkingLotIsFull() {
        ParkingLot parkingLot = new ParkingLot(1);
        assertTrue(parkingLot.park());
        assertTrue(parkingLot.isFull());
    }

    @Test
    void shouldThrowErrorIfLotIsFull() {
        ParkingLot parkingLot = new ParkingLot(1);
        assertTrue(parkingLot.park());
        assertFalse(parkingLot.park());
    }
}
