package com.techguru.parkinglot.vehicle;

import com.techguru.parkinglot.space.ParkingSpaceSizeEnum;

public class LorryVehicle implements Vehicle {

    private String registration;

    public String getRegistration() {
        return registration;
    }

    @Override
    public VehicleTypeEnum getVehicleType() {
        return VehicleTypeEnum.LORRY;
    }

    @Override
    public ParkingSpaceSizeEnum minimumRequiredParkingSpaceSize() {
        return ParkingSpaceSizeEnum.LL;
    }

    @Override
    public double getPerHourRate() {
        return 40;
    }

    public LorryVehicle(String registration) {
        this.registration = registration;
    }

}
