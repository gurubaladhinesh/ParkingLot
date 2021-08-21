package com.techguru.parkinglot;

import com.techguru.parkinglot.exception.ParkingSpotNotFoundException;
import com.techguru.parkinglot.exception.TicketNotFoundException;
import com.techguru.parkinglot.spot.BikeSpot;
import com.techguru.parkinglot.spot.CarSpot;
import com.techguru.parkinglot.vehicle.BikeVehicle;

public class ParkingLotMain {

    public static void main(String[] args) throws ParkingSpotNotFoundException, TicketNotFoundException {

        ParkingLot parkingLot = ParkingLot.getInstance();


        parkingLot.addParkingSpot(new BikeSpot());
        parkingLot.addParkingSpot(new BikeSpot());
        parkingLot.addParkingSpot(new BikeSpot());
        parkingLot.addParkingSpot(new CarSpot());
        parkingLot.addParkingSpot(new CarSpot());
        String ticketNumber = parkingLot.accommodateVehicle(new BikeVehicle("TN11AD8259"));
        System.out.println("Ticket number::" + ticketNumber);
        double charges = parkingLot.freeVehicle(ticketNumber);
        System.out.println("Charges::" + charges);


    }
}
