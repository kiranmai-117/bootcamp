package com.tw.bootcamp.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AttendantTest {
    @Test
    void shouldPark() {
        Attendant attendant = new Attendant(ParkingFacility.create(2, 3));
        assertTrue(attendant.park(0));
    }
}