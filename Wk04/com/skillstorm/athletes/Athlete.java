package com.skillstorm.athletes;

public class Athlete implements Comparable<Athlete>{

	private String name;
	private int careerWins;
	private int careerLosses;
	
	public Athlete(String name, int careerWins, int careerLosses) {
		super();
		this.name = name;
		this.careerWins = careerWins;
		this.careerLosses = careerLosses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCareerWins() {
		return careerWins;
	}

	public void setCareerWins(int careerWins) {
		this.careerWins = careerWins;
	}

	public int getCareerLosses() {
		return careerLosses;
	}

	public void setCareerLosses(int careerLosses) {
		this.careerLosses = careerLosses;
	}

	/*
	 * use WinLossRatioComparator class to sort based on that
	 * this compareTo function is sorts by name, then wins
	 * I just made this to add variety and to see if I could
	 * make a double sort work inside the single method
	 */
	@Override
	public int compareTo(Athlete otherAthlete) {
		//throw NullPointerException if passed Athlete is null
		if(otherAthlete != null) {
			//throw IllegalArgumentException if passed Athlete's name is null
			if (otherAthlete.name != null) {
				if(this.name.equalsIgnoreCase(otherAthlete.name)) {
					return this.careerWins - otherAthlete.careerWins;
				}
				return this.name.compareToIgnoreCase(otherAthlete.name);
			}
			throw new IllegalArgumentException("Athlete's name is null");
		}
		throw new NullPointerException("Value of Athlete is null");
	}

	@Override
	public String toString() {
		return "\nAthlete [name = " + name + ", careerWins = " + careerWins + ", careerLosses = " + careerLosses + "]";
	}

	
	
}
