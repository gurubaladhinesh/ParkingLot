package com.techguru.parkinglot.vehicle;

import com.techguru.parkinglot.space.ParkingSpaceSizeEnum;

public interface Vehicle {

    VehicleTypeEnum getVehicleType();

    double getPerHourRate();

    ParkingSpaceSizeEnum minimumRequiredParkingSpaceSize();

}
