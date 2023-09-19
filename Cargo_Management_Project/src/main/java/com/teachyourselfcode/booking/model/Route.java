package com.teachyourselfcode.booking.model;

public class Route {
private float routeDistance;
private String destination;
private String startingPoint;
public float getRouteDistance() {
	return routeDistance;
}
public void setRouteDistance(int routeDistance) {
	this.routeDistance = routeDistance;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public String getStartingPoint() {
	return startingPoint;
}

public void setStartingPoint(String startingPoint) {
	this.startingPoint = startingPoint;
}
public Route(int routeDistance, String destination, String startingPoint) {
	super();
	this.routeDistance = routeDistance;
	this.destination = destination;
	this.startingPoint = startingPoint;
}
public Route() {
	// TODO Auto-generated constructor stub
}
}

