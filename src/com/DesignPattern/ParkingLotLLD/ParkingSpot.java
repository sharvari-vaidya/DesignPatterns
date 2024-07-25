package com.DesignPattern.ParkingLotLLD;

public class ParkingSpot {

	ParkingSpotType parkingSpotType;
	boolean isFree;
	Vehicle vehicle;

	public ParkingSpot(ParkingSpotType parkingSpotType) {
		super();
		this.parkingSpotType = parkingSpotType;
	}

	public ParkingSpotType getParkingSpotType() {
		return parkingSpotType;
	}

	public void setParkingSpotType(ParkingSpotType parkingSpotType) {
		this.parkingSpotType = parkingSpotType;
	}

	public boolean isFree() {
		return isFree;
	}

	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

}
