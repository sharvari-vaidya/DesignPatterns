package com.DesignPattern.ParkingLotLLD;


public class Vehicle {

	String vehicleNo;
	VehicleType vehicleType;
	ParkingSpot parkingSpot;

	public Vehicle(String vehicleNo, VehicleType vehicleType) {
		super();
		this.vehicleNo = vehicleNo;
		this.vehicleType = vehicleType;
	}
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public VehicleType getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	public ParkingSpot getParkingSpot() {
		return parkingSpot;
	}
	public void setParkingSpot(ParkingSpot parkingSpot) {
		this.parkingSpot = parkingSpot;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicleNo=" + vehicleNo + ", vehicleType=" + vehicleType + ", parkingSpot=" + parkingSpot
				+ "]";
	}
}
