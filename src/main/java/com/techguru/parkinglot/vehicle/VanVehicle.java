package com.techguru.parkinglot.vehicle;

import com.techguru.parkinglot.space.ParkingSpaceSizeEnum;

public class VanVehicle implements Vehicle {

    private String registration;

    public String getRegistration() {
        return registration;
    }

    @Override
    public VehicleTypeEnum getVehicleType() {
        return VehicleTypeEnum.VAN;
    }

    @Override
    public ParkingSpaceSizeEnum minimumRequiredParkingSpaceSize() {
        return ParkingSpaceSizeEnum.MM;
    }

    @Override
    public double getPerHourRate() {
        return 25;
    }

    public VanVehicle(String registration) {
        this.registration = registration;
    }

}
