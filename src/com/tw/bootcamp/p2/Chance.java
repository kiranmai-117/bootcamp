package com.tw.bootcamp.p2;

public class Chance {
    private final double dataset;
    private final double occurrence;

    public Chance(int dataset, int occurrence) {
        this.dataset = dataset;
        this.occurrence = occurrence;
    }

    public double getProbability() {
        return occurrence / dataset;
    }
}
