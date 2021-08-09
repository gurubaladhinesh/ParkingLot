package com.techguru.parkinglot;

import com.techguru.parkinglot.lot.ParkingLot;
import com.techguru.parkinglot.space.ParkingSpaceImpl;
import com.techguru.parkinglot.space.ParkingSpaceSizeEnum;
import com.techguru.parkinglot.vehicle.BikeVehicle;

public class ParkingLotMain {

    public static void main(String[] args) {

        ParkingLot parkingLot = ParkingLot.getInstance();

        parkingLot.addParkingSpace(new ParkingSpaceImpl(ParkingSpaceSizeEnum.SS));

        parkingLot.addParkingSpace(new ParkingSpaceImpl(ParkingSpaceSizeEnum.S));

        parkingLot.vehicleEntry(new BikeVehicle("TN11AK2751"));

        parkingLot.vehicleExit("TN11AK2751");



    }
}
