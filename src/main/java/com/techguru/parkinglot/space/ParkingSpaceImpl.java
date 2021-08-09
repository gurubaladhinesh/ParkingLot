package com.techguru.parkinglot.space;

public class ParkingSpaceImpl implements ParkingSpace {

    private ParkingSpaceSizeEnum parkingSpaceSize;

    @Override
    public ParkingSpaceSizeEnum getParkingSpaceSize() {
        return parkingSpaceSize;
    }

    public ParkingSpaceImpl(ParkingSpaceSizeEnum parkingSpaceSize) {
        this.parkingSpaceSize = parkingSpaceSize;
    }

}
