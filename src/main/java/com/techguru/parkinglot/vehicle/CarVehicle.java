package com.techguru.parkinglot.vehicle;

import com.techguru.parkinglot.space.ParkingSpaceSizeEnum;

public class CarVehicle implements Vehicle {

    private String registration;

    public String getRegistration() {
        return registration;
    }

    @Override
    public VehicleTypeEnum getVehicleType() {
        return VehicleTypeEnum.CAR;
    }

    @Override
    public ParkingSpaceSizeEnum minimumRequiredParkingSpaceSize() {
        return ParkingSpaceSizeEnum.M;
    }

    @Override
    public double getPerHourRate() {
        return 20;
    }

    public CarVehicle(String registration) {
        this.registration = registration;
    }
}
