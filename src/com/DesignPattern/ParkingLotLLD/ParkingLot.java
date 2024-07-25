package com.DesignPattern.ParkingLotLLD;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

	List<CompactSpot> compactSpotList = new ArrayList<>();
	List<BikeSpot> bikeSpot = new ArrayList<>();
	List<LargeSpot> largeSpot = new ArrayList<>();

	int large;
	int bike;
	int compact;

	public ParkingLot(int large, int bike, int compact) {
		super();
		this.large = large;
		this.bike = bike;
		this.compact = compact;
	}

	void parkVehicle(Vehicle v) {
		if (v.getVehicleType() == VehicleType.TRUCK) {
			if (large > 0) {
				parkTruck(v);
			} else {
				System.out.println("No large space left");
			}

		} else if (v.getVehicleType() == VehicleType.CAR) {
			if (compact > 0) {
				parkCar(v);
			} else if (large > 0) {
				parkTruck(v);
			} else {
				System.out.println("No compact space left");
			}
		} else if (v.getVehicleType() == VehicleType.BIKE) {
			if (bike > 0) {
				parkBike(v);
			} else if (compact > 0) {
				parkCar(v);
			} else if (large > 0) {
				parkTruck(v);
			} else {
				System.out.println("No bike space left");
			}

		} else {
			System.out.println("No vehicle type present..");
		}
	}

	private void parkBike(Vehicle vehicle) {
		BikeSpot bs= new BikeSpot(ParkingSpotType.BIKE);
		bs.setFree(false);
		bs.setVehicle(vehicle);
		vehicle.setParkingSpot(bs);
		bikeSpot.add(bs);
		bike--;
		System.out.println("We have parked bike no :: "+vehicle.getVehicleNo());
		
		
	}

	private void parkCar(Vehicle vehicle) {
		CompactSpot cs= new CompactSpot(ParkingSpotType.COMPACT);
		cs.setFree(false);
		cs.setVehicle(vehicle);
		vehicle.setParkingSpot(cs);
		compactSpotList.add(cs);
		compact--;
		System.out.println("We have parked car :: "+vehicle.getVehicleNo());
		
		
	}

	private void parkTruck(Vehicle vehicle) {
		LargeSpot ls= new LargeSpot(ParkingSpotType.LARGE);
		ls.setFree(false);
		ls.setVehicle(vehicle);
		vehicle.setParkingSpot(ls);
		largeSpot.add(ls);
		large--;
		System.out.println("We have parked truck :: "+vehicle.getVehicleNo());
		
		
	}

	void unpark(Vehicle v) {
		ParkingSpot ps= v.getParkingSpot();
		ps.setFree(true);
		
		if (v.getVehicleType() == VehicleType.TRUCK) {
			largeSpot.remove(v);
			large++;
			System.out.println("Unparked your truck!!!!");
		} else if (v.getVehicleType() == VehicleType.CAR) {
			compactSpotList.remove(v);
			compact++;
			System.out.println("Unparked your car!!!!");
		} else if (v.getVehicleType() == VehicleType.BIKE) {
			bikeSpot.remove(v);
			bike++;
			System.out.println("Unparked your bike!!!!");
		} else {
			System.out.println("No vehicle type present..");
		}
	}

}
