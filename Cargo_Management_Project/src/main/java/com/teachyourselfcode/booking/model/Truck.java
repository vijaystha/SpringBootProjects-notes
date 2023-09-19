package com.teachyourselfcode.booking.model;


public class Truck {
	
private int truckId;
private String truckModel;
private String truckDealer;
private String truckNumber;
private double loadSize;
public int getTruckId() {
	return truckId;
}
public void setTruckId(int truckId) {
	this.truckId = truckId;
}
public String getTruckModel() {
	return truckModel;
}
public void setTruckModel(String truckModel) {
	this.truckModel = truckModel;
}
public double getLoadSize() {
	return loadSize;
}
public void setLoadSize(double loadSize) {
	this.loadSize = loadSize;
}
public String getTruckDealer() {
	return truckDealer;
}
public void setTruckDealer(String truckDealer) {
	this.truckDealer = truckDealer;
}
public Truck(int truckId, String truckModel, String truckDealer, String truckNumber, double loadSize) {
	super();
	this.truckId = truckId;
	this.truckModel = truckModel;
	this.truckDealer = truckDealer;
	this.truckNumber= truckNumber;
	this.loadSize= loadSize;
	
}
public Truck() {
	// TODO Auto-generated constructor stub
}
public String getTruckNumber() {
	return truckNumber;
}
public void setTruckNumber(String truckNumber) {
	this.truckNumber = truckNumber;
}

}
