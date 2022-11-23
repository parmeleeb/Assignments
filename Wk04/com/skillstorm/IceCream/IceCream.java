package com.skillstorm.IceCream;

public class IceCream {

	private String flavor;
	private boolean dairyFree;
	private boolean nutFree;
	
	public IceCream(String flavor, boolean dairyFree, boolean nutFree) {
		this.flavor = flavor;
		this.dairyFree = dairyFree;
		this.nutFree = nutFree;
	}

	public String getFlavor() {
		return flavor;
	}

	public boolean isDairyFree() {
		return dairyFree;
	}

	public boolean isNutFree() {
		return nutFree;
	}
	
	public boolean equals(Object anotherIceCream) {
		return this.toString().equals(anotherIceCream.toString());
	}

	public String toString() {
		return "IceCream [flavor = " + flavor + ", dairyFree = " + dairyFree + ", nutFree = " + nutFree + "]";
	}
	
	
}
