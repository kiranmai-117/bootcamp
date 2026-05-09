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
        assertTrue(parkingFacility.park());
    }


    @Test
    void shouldParkTheCarInTheParkingLotEvenThoughFirstOneIsFull() {
        ParkingFacility parkingFacility = ParkingFacility.create(2, 1);
        parkingFacility.park();
        assertTrue(parkingFacility.park());
    }

    @Test
    void shouldNotParkTheCarInTheParkingLotWhenAllLotsAreFull() {
        ParkingFacility parkingFacility = ParkingFacility.create(2, 1);
        parkingFacility.park();
        parkingFacility.park();
        assertFalse(parkingFacility.park());
    }
}
