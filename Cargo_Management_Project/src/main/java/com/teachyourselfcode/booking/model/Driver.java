package com.teachyourselfcode.booking.model;

public class Driver {
private int driverId;
private String driverName;
private String driverAddress;
private long driverMobileNum;
private String driverEmail;
private String gender;
public long getDriverMobileNum() {
	return driverMobileNum;
	
}
public void setDriverMobileNum(long driverMobileNum) {
	this.driverMobileNum = driverMobileNum;
}
public String getDriverEmail() {
	return driverEmail;
}
public void setDriverEmail(String driverEmail) {
	this.driverEmail = driverEmail;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}


public int getDriverId() {
	return driverId;
}
public void setDriverId(int driverId) {
	this.driverId = driverId;
}
public String getDriverName() {
	return driverName;
}
public void setDriverName(String driverName) {
	this.driverName = driverName;
}
public String getDriverAddress() {
	return driverAddress;
}
public void setDriverAddress(String driverAddress) {
	this.driverAddress = driverAddress;
}



public Driver(int driverId, String driverName, String driverAddress, long driverMobileNum, String driverEmail,
		String gender) {
	super();
	this.driverId = driverId;
	this.driverName = driverName;
	this.driverAddress = driverAddress;
	this.driverMobileNum = driverMobileNum;
	this.driverEmail = driverEmail;
	this.gender = gender;
}
public Driver() {
	// TODO Auto-generated constructor stub
}
}
