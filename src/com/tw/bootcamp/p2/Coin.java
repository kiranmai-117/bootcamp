package com.tw.bootcamp.p2;

public class Coin {
    public static double getProbabilityOfTails() {
        return 0.5;
    }

    public static double getProbabilityOfHead() {
        return 1 - getProbabilityOfTails();
    }
}
