package com.techguru.parkinglot.space;

public enum ParkingSpaceSizeEnum {

    SS(0), S(1), M(2), MM(3), L(4), LL(5);

    private int sizeRankAscending;

    public int getSizeRankAscending() {
        return sizeRankAscending;
    }

    ParkingSpaceSizeEnum(int sizeRankAscending) {
        this.sizeRankAscending = sizeRankAscending;
    }

}
