package com.techguru.parkinglot.spot;

public class BikeSpot extends ParkingSpot {
    @Override
    public ParkingSpotType getParkingSpotType() {
        return ParkingSpotType.BIKE_SPOT;
    }

    @Override
    public double getPerHourRate() {
        return 2;
    }
}
