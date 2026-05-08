package com.tw.bootcamp.p4;

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
}
