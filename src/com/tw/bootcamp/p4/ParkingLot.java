package com.tw.bootcamp.p4;

import java.util.Objects;

public class ParkingLot {
    private int emptySlots;

    public ParkingLot(int emptySlots) {
        this.emptySlots = emptySlots;
    }

    public boolean park() {
        if (isFull()) {
            return false;
        }

        emptySlots--;
        return true;
    }

    public boolean isFull() {
        return emptySlots <= 0;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ParkingLot that = (ParkingLot) o;
        return emptySlots == that.emptySlots;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(emptySlots);
    }
}
