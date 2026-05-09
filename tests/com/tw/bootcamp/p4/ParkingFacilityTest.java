package com.tw.bootcamp.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingFacilityTest {
    @Test
    void shouldBeEqualTwoFacilitiesAreEqual() {
        ParkingFacility parkingFacility1 = ParkingFacility.create(2, 10);
        ParkingFacility parkingFacility2 = ParkingFacility.create(2, 10);
        assertEquals(parkingFacility1, parkingFacility2);
    }

    @Test
    void shouldParkTheCarInTheParkingLot() {
        ParkingFacility parkingFacility = ParkingFacility.create(2, 3);
        assertTrue(parkingFacility.park(0));
    }


    @Test
    void shouldParkTheCarInTheParkingLotEvenThoughFirstOneIsFull() {
        ParkingFacility parkingFacility = ParkingFacility.create(2, 1);
        parkingFacility.park(0);
        assertTrue(parkingFacility.park(1));
    }

    @Test
    void shouldNotParkTheCarInTheParkingLotWhenAllLotsAreFull() {
        ParkingFacility parkingFacility = ParkingFacility.create(2, 1);
        parkingFacility.park(0);
        parkingFacility.park(1);
        assertFalse(parkingFacility.park(1));
    }
}
