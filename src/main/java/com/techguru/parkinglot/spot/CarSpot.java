package com.techguru.parkinglot.spot;

public class CarSpot extends ParkingSpot {
    @Override
    public ParkingSpotType getParkingSpotType() {
        return ParkingSpotType.CAR_SPOT;
    }

    @Override
    public double getPerHourRate() {
        return 4;
    }
}
