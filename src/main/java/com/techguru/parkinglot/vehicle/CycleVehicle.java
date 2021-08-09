package com.techguru.parkinglot.vehicle;

import com.techguru.parkinglot.space.ParkingSpaceSizeEnum;

public class CycleVehicle implements Vehicle {

    private String registration;

    public String getRegistration() {
        return registration;
    }

    @Override
    public VehicleTypeEnum getVehicleType() {
        return VehicleTypeEnum.CYCLE;
    }

    @Override
    public ParkingSpaceSizeEnum minimumRequiredParkingSpaceSize() {
        return ParkingSpaceSizeEnum.SS;
    }

    @Override
    public double getPerHourRate() {
        return 10;
    }

    public CycleVehicle(String registration) {
        this.registration = registration;
    }
}
