package com.DesignPattern.ParkingLotLLD;

public class MainClient {

	public static void main(String[] args) {
		ParkingLot pl = new ParkingLot(2, 2, 2);
		pl.parkVehicle(new Vehicle("1000", VehicleType.BIKE));
		pl.parkVehicle(new Vehicle("20000", VehicleType.BIKE));
		pl.parkVehicle(new Vehicle("3000", VehicleType.BIKE));
		pl.parkVehicle(new Vehicle("45564", VehicleType.BIKE));
		pl.parkVehicle(new Vehicle("1", VehicleType.BIKE));
		pl.parkVehicle(new Vehicle("12131", VehicleType.BIKE));
		pl.parkVehicle(new Vehicle("42341", VehicleType.BIKE));
		
	}
}
