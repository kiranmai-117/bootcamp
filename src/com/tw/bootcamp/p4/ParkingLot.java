package com.tw.bootcamp.p4;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private final List<Boolean> lot;
    private final int size;

    public ParkingLot(int size) {
        this.size = size;
        lot = new ArrayList<>();
    }

    public boolean park() {
        return lot.add(true);
    }
}
