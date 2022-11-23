package com.skillstorm.CarRental;

import java.util.Objects;

public class Car {
	private final String name;
	private final int year;
	private final CarType type;
	private double rentalPrice;
	
	public Car(String name, int year, CarType type, double rentalPrice) {
		super();
		this.name = name;
		this.year = year;
		this.type = type;
		this.rentalPrice = rentalPrice;
	}

	public double getRentalPrice() {
		return rentalPrice;
	}

	public void setRentalPrice(double rentalPrice) {
		this.rentalPrice = rentalPrice;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public CarType getType() {
		return type;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, rentalPrice, type, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Car))
			return false;
		Car other = (Car) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(rentalPrice) == Double.doubleToLongBits(other.rentalPrice)
				&& type == other.type && year == other.year;
	}

	@Override
	public String toString() {
		return "Car [name = " + name + ", year = " + year + ", type = " + type + ", rentalPrice = " + rentalPrice + "]";
	}
}
