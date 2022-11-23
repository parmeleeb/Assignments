package com.skillstorm.CarRental;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Objects;
import java.util.Scanner;

public class Customer {

	private String name;
	private LocalDateTime DOB;
	private CustomerType type;
	private CarType request;
	private Car rentalCar;
	private Scanner userInput;
	
	public Customer(String name, LocalDateTime DOB, CustomerType type, CarType request, Car rentalCar, Scanner userInput) {
		super();
		setName(name);
		setDOB(DOB);
		setType(type);
		setRequest(request);
		setRentalCar(rentalCar);
		setUserInput(userInput);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getDOB() {
		return DOB;
	}
	
	private void setDOB(LocalDateTime DOB) {
		if(Period.between(LocalDate.now(), DOB.toLocalDate()).toTotalMonths() < 0) {
			this.DOB = DOB;
		}
		else {
			throw new IllegalArgumentException("Cannot be born in the future");
		}
	}

	public CustomerType getType() {
		return type;
	}

	public void setType(CustomerType type) {
		this.type = type;
	}

	public CarType getRequest() {
		return request;
	}

	public void setRequest(CarType request) {
		this.request = request;
	}

	public Car getRentalCar() {
		return rentalCar;
	}

	public void setRentalCar(Car rentalCar) {
		this.rentalCar = rentalCar;
	}

	public Scanner getUserInput() {
		return userInput;
	}

	public void setUserInput(Scanner userInput) {
		this.userInput = userInput;
	}

	@Override
	public int hashCode() {
		return Objects.hash(DOB, name, rentalCar, request, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Customer))
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(DOB, other.DOB) && Objects.equals(name, other.name)
				&& Objects.equals(rentalCar, other.rentalCar) && request == other.request && type == other.type;
	}

	@Override
	public String toString() {
		return "Customer [name = " + name + ", DOB = " + DOB + ", type = " + type + ", request = " + request
				+ ", rentalCar = " + rentalCar + "]";
	}
}
