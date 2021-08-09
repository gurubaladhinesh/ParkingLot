package com.techguru.parkinglot.vehicle;

import com.techguru.parkinglot.space.ParkingSpaceSizeEnum;

public class BusVehicle implements Vehicle {

    private String registration;

    public String getRegistration() {
        return registration;
    }

    @Override
    public VehicleTypeEnum getVehicleType() {
        return VehicleTypeEnum.BUS;
    }

    @Override
    public ParkingSpaceSizeEnum minimumRequiredParkingSpaceSize() {
        return ParkingSpaceSizeEnum.L;
    }

    @Override
    public double getPerHourRate() {
        return 50;
    }

    public BusVehicle(String registration) {
        this.registration = registration;
    }

}
