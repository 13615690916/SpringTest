package com.smart.car.model;

public class Car {
	private int maxSpeed;
	private String brand;
	private double price;
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(int maxSpeed, String brand, double price) {
		super();
		this.maxSpeed = maxSpeed;
		this.brand = brand;
		this.price = price;
	}
	@Override
	public String toString() {
		return "model [maxSpeed=" + maxSpeed + ", brand=" + brand + ", price="
				+ price + "]";
	}
	
	
}
