package com.skillstorm.CarRental;

import static com.skillstorm.CarRental.CustomerType.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.time.LocalDate;
import java.time.Period;

public class CarRentalBusiness {
	private HashMap<CarType, LinkedList<Car>> inventory;
	private Queue<Customer> customerLine;
	private double moneyEarned;
	private double youngDriverFee;
	
	public void helpNextCustomer() {
		if (customerLine.isEmpty()) {
			System.out.println("No customers in line.");
			return;
		}
		Customer customer = customerLine.poll();
		if (customer.getType().equals(RETURNING_CAR)) {
			returnCar(customer);
		}
		else if (customer.getType().equals(PICKING_UP_CAR)) {
			rentCar(customer);
		}
	}
	
	private void rentCar(Customer customer) {
		Car desiredCar = null;
		if (customer!= null && getCustomerAge(customer) >= 21) {
			desiredCar = getChoiceFromCustomer(customer);
		}
		if(desiredCar == null) {
			System.out.println("Sorry I can't help you.");
			return;
		}
		exchangeCarForPayment(desiredCar, customer);
	}
	
	private int getCustomerAge(Customer customer) {
		return Period.between(customer.getDOB().toLocalDate(), 
					    	   LocalDate.now()).getYears();
	}
	
	private void exchangeCarForPayment(Car desiredCar, Customer customer) {
		customer.setRentalCar(desiredCar);
		LinkedList<Car> listOfCars = inventory.get(desiredCar.getType());
		listOfCars.remove(desiredCar);
		moneyEarned += getRentalCost(customer, desiredCar);
	}
	
	private Car getChoiceFromCustomer(Customer customer) {
		if(!isCarTypeAvailable(customer.getRequest())) return null;
		int choice = -1;
		LinkedList<Car> listOfCars = inventory.get(customer.getRequest());
		displayListOfCars(customer, listOfCars);
		while (choice < 0 || choice >= listOfCars.size()) {
				choice = customer.getUserInput().nextInt() - 1;
				if (choice < 0 || choice > listOfCars.size()) {
					System.out.println("Please make a valid selection");
				}
			if(choice == listOfCars.size()) return null;
		}
		return listOfCars.get(choice);
	}
	
	private void displayListOfCars(Customer customer, 
								   LinkedList<Car> listOfCars) {
		System.out.println("Which car from the " + customer.getRequest() + 
				" lineup would you like?");
		for (Car car : listOfCars) {
			System.out.println((listOfCars.indexOf(car) + 1) + ") " + 
								car.getYear() + " " + car.getName() + 
								" for $" + getRentalCost(customer, car));
		}
		System.out.println((listOfCars.size() + 1) + 
							") Nevermind, I don't want any of these.");
	}
	
	private boolean isCarTypeAvailable(CarType carType) {
		if (carType != null) {
			Collection<CarType> listOfCarTypes = inventory.keySet();
			for (CarType currentCarType : listOfCarTypes) {
				if (currentCarType.equals(carType)) return true;
			}
		} return false;
	}
	
	private double getRentalCost(Customer customer, Car car) {
		double cost = car.getRentalPrice();
		int age = getCustomerAge(customer);
		if (age < 25) {
			cost += youngDriverFee;
		}
		return cost;
	}
	
	private void returnCar(Customer customer) {
		if (customer == null || customer.getRentalCar() == null) {
			throw new IllegalArgumentException("invalid customer");
		}
		Car returningCar = customer.getRentalCar();
		addCar(returningCar);
		customer.setRentalCar(null);
	}
	
	public void addCar(Car car) {
		if (car == null) {
			throw new IllegalArgumentException("invalid car");
		}
		CarType carType = car.getType();
		if (inventory.containsKey(carType)) {
			inventory.get(carType).add(car);
		}
		else {
			LinkedList<Car> carList = new LinkedList<>();
			carList.add(car);
			inventory.put(carType, carList);
		}
	}
	
	public void removeCar(Car car) {
		
	}
	
	public CarRentalBusiness(HashMap<CarType, LinkedList<Car>> inventory, 
							 Queue<Customer> customerLine,
							 double moneyEarned,
							 double youngDriverFee) {
		super();
		this.inventory = inventory;
		this.customerLine = customerLine;
		this.moneyEarned = moneyEarned;
		this.youngDriverFee = youngDriverFee;
	}

	public HashMap<CarType, LinkedList<Car>> getInventory() {
		return inventory;
	}

	public void setInventory(HashMap<CarType, LinkedList<Car>> inventory) {
		this.inventory = inventory;
	}

	public Queue<Customer> getCustomerLine() {
		return customerLine;
	}

	public void setCustomerLine(Queue<Customer> customerLine) {
		this.customerLine = customerLine;
	}

	public double getMoneyEarned() {
		return moneyEarned;
	}

	public void setMoneyEarned(double moneyEarned) {
		this.moneyEarned = moneyEarned;
	}
	
	public double getYoungDriverFee() {
		return youngDriverFee;
	}

	public void setYoungDriverFee(double youngDriverFee) {
		this.youngDriverFee = youngDriverFee;
	}

	@Override
	public String toString() {
		return "CarRentalBusiness [inventory = " + inventory + ", customerLine = " + customerLine + ", moneyEarned = "
				+ moneyEarned + ", youngDriverFee = " + youngDriverFee + "]";
	}
}
