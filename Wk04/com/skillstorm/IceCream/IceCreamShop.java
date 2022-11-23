package com.skillstorm.IceCream;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class IceCreamShop {

	private double dailyEarnings = 0;
	private Queue<Customer> customers = new LinkedList<>();
	private ArrayList<IceCream> availavleIceCreams = new ArrayList<>();
	private double pricePerScoop = 1;
	
	public IceCreamShop() {
		super();
	}
	
	public IceCreamShop(ArrayList<IceCream> availableIceCreams, double pricePerScoop) {
		if(availableIceCreams != null)
			this.availavleIceCreams = new ArrayList<>(availableIceCreams);
		if(pricePerScoop < 0)
			pricePerScoop = 1;
		this.pricePerScoop = pricePerScoop;
	}

	public ArrayList<IceCream> getAvailableIceCreams() {
		return availavleIceCreams;
	}

	public void setAvailableIceCreams(ArrayList<IceCream> availableIceCreams) {
		if(availableIceCreams != null)
			this.availavleIceCreams = new ArrayList<>(availableIceCreams);
	}

	public double getDailyEarnings() {
		return dailyEarnings;
	}

	public Queue<Customer> getCustomers() {
		return customers;
	}
	
	public double getPricePerScoop() {
		return pricePerScoop;
	}

	public void setPricePerScoop(double pricePerScoop) {
		if(pricePerScoop < 0)
			pricePerScoop = 1;
		this.pricePerScoop = pricePerScoop;
	}

	public boolean addCustomer(Customer newCustomer) {
		return customers.offer(newCustomer);
	}
	
	public boolean serviceCustomer() {
		if(customers.isEmpty())
			throw new RuntimeException("Queue is empty");
		
		Customer nextCustomer = customers.poll();
		if(nextCustomer.getWantedIceCream() == null)
			throw new RuntimeException("Get outta my line. I ain't got all day.");
		
		else if(checkIceCreamOnMenu(nextCustomer.getWantedIceCream()) == -1) 
			throw new RuntimeException("Flavor not on menu");
		
		double costOfIceCream = nextCustomer.getNumberOfScoopsWanted() * pricePerScoop;
		if(nextCustomer.removeFromAvailableCash(costOfIceCream)) {
			dailyEarnings += costOfIceCream;
			return true;
		}
		else return false;
	}
	
	public void addFlavor(IceCream flavorToAdd) {
		if(checkIceCreamOnMenu(flavorToAdd) == -1) 
			availavleIceCreams.add(flavorToAdd);
	}
	
	public boolean removeFlavor(IceCream flavorToRemove) {
		if(checkIceCreamOnMenu(flavorToRemove) != -1) {
			availavleIceCreams.remove(checkIceCreamOnMenu(flavorToRemove));
			return true;
		}
		return false;
	}
	
	private int checkIceCreamOnMenu(IceCream wantedIceCream) {
		int index = 0;
		if(availavleIceCreams == null){
			return -1;
		}
		for(IceCream iceCream : availavleIceCreams) {
			if(iceCream.equals(wantedIceCream))
				return index;
			index++;
		}
		return -1;
	}

	public String toString() {
		return "IceCreamShop [dailyEarnings = " + dailyEarnings + ", customers = " + customers + 
				", availableIceCreams = " + availavleIceCreams + ", pricePerScoop = " + pricePerScoop + "]";
	}
	
	
}
