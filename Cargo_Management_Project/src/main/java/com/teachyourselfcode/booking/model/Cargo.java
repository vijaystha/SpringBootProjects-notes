package com.teachyourselfcode.booking.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cargo {
	private int cargoId;
	private String name;
	private String description;
	private double weight;
	private double volume;
	private Date pickUpDate;
	private Date deliveryDate;
public int getCargoId() {
		return cargoId;
	}
	public void setCargoId(int cargoId) {
		this.cargoId = cargoId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public Date getPickUpDate() {
		return pickUpDate;
	}
	public void setPickUpDate(Date pickUpDate) {
		this.pickUpDate = pickUpDate;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public Cargo(int cargoId, String name, String description, double weight, double volume, Date pickUpDate,
			Date deliveryDate) {
		super();
		this.cargoId = cargoId;
		this.name = name;
		this.description = description;
		this.weight = weight;
		this.volume = volume;
		this.pickUpDate = pickUpDate;
		this.deliveryDate = deliveryDate;
	}
public Cargo() {
	// TODO Auto-generated constructor stub
}

}
