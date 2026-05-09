package com.tw.bootcamp.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingFacilityTest {
    @Test
    void shouldBeEqualTwoFacilitiesAreEqual() {
        ParkingFacility parkingFacility1 = ParkingFacility.create(2, 10);
        ParkingFacility parkingFacility2 = ParkingFacility.create(2, 10);
        assertEquals(parkingFacility1, parkingFacility2);
    }
}
