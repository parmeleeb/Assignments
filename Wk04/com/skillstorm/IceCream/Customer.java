package com.skillstorm.IceCream;

public class Customer {

	private String name;
	private double availableCash;
	private IceCream wantedIceCream;
	private int numberOfScoopsWanted;
	
	public Customer(String name, double availableCash, IceCream wantedIceCream, int numberOfScoopsWanted) {
		super();
		this.name = name;
		if(availableCash < 0)
			availableCash = 0;
		this.availableCash = availableCash;
		this.wantedIceCream = wantedIceCream;
		if(numberOfScoopsWanted < 1)
			numberOfScoopsWanted = 1;
		this.numberOfScoopsWanted = numberOfScoopsWanted;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAvailableCash() {
		return availableCash;
	}

	public void setAvailableCash(double availableCash) {
		if(availableCash < 0)
			availableCash = 0;
		this.availableCash = availableCash;
	}
	
	public IceCream getWantedIceCream() {
		return wantedIceCream;
	}

	public void setWantedIceCream(IceCream wantedIceCream) {
		this.wantedIceCream = wantedIceCream;
	}

	public int getNumberOfScoopsWanted() {
		return numberOfScoopsWanted;
	}

	public void setNumberOfScoopsWanted(int numberOfScoopsWanted) {
		if(numberOfScoopsWanted < 1)
			numberOfScoopsWanted = 1;
		this.numberOfScoopsWanted = numberOfScoopsWanted;
	}

	public void addToAvailableCash(double cashToAdd) {
		availableCash += cashToAdd;
	}
	
	public boolean removeFromAvailableCash(double cashToRemove) {
		if((availableCash - cashToRemove) >= 0) {
			availableCash -= cashToRemove;
			return true;
		}
		return false;
	}

	public String toString() {
		return "Customer [name = " + name + ", availableCash = " + availableCash + ", wantedIceCream = "
				 + wantedIceCream + ", numberOfScoopsWanted = " + numberOfScoopsWanted + "]";
	}
	
	
}
