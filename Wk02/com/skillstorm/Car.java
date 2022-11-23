package com.skillstorm;

public class Car {

	//final variable are attributes that would not change throughout the car's life
	final String MAKE;
	final String MODEL;
	final byte NUMBEROFDOORS;
	final int YEAR;
	
	//other variable are attributes that can and will likely change throughout the car's life
	String color;
	String owner;
	boolean isNew;
	double mileage;
	double value;
	
	//I made the default constructor, but the system doesn't like default constructors' interaction with "final" variables if they're not initialized
//	public Car() {
//		super();
//	}
	
	
	//Constructor for creating a car object with all parameters filled by arguments
	public Car(String MAKE, String MODEL, byte NUMBEROFDOORS, int YEAR, String color, String owner, boolean isNew, double mileage, double value) {
		this.MAKE = MAKE;
		this.MODEL = MODEL;
		this.NUMBEROFDOORS = NUMBEROFDOORS;
		this.YEAR = YEAR;
		this.color = color;
		this.owner = owner;
		this.isNew = isNew;
		this.mileage = mileage;
		this.value = value;
	}
	
	//allows the transfer of ownership of the car, and after the first time being sold, the isNew variable is changed to false
	public void buy(String newOwner) {
		if(isNew) {
			System.out.println("Congratulations on buying your new car, " + newOwner + "!");
			isNew = false;
			value *= 0.9;
		}
		else 
			System.out.println("Congratulations on buying your used car from " + owner + ", " + newOwner + "!");
		owner = newOwner;
		System.out.println();
	}
	
	//allows you to choose a new color to change the value of the color variable for the car object
	public void repaint(String newColor) {
		System.out.println("You previously " + color + " " + YEAR + " " + MAKE + " " + MODEL + " is now " + newColor + "!");
		color = newColor;
		System.out.println();
	}
	
	//takes in a distance for the trip and adds it to the odometer while depreciating the value of the car
	public void drive(double milesForTrip) {
		System.out.println("Time to take this baby for a spin!");
		System.out.print("What a great trip! You started your trip with " + mileage + " miles on the odometer and after your " + milesForTrip + " trip, ");
		mileage += milesForTrip;
		System.out.println("your current odometer reading is " + mileage + ".");
		System.out.println("A small price to pay for a great trip!");
		value -= value*0.00001*milesForTrip;
		System.out.println();
	}
	
	//just call this method to see all of the information for the car laid out in a readable manner
	public void showInfo() {
		if(isNew)
			System.out.println("This new " + color + " " + NUMBEROFDOORS + "-door " + YEAR + " " + MAKE + " " + MODEL + " has " + mileage + " miles on it and is worth $" + value + "!");
		else
			System.out.println("This used " + color + " " + NUMBEROFDOORS + "-door " + YEAR + " " + MAKE + " " + MODEL + " has " + mileage + " miles on it, is worth $" + value + " and is owned by " + owner + "!");
	System.out.println();
	}
}
