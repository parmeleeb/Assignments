package com.skillstorm;

public class Circle {

	//the only relevant data type for this circle, since the other attributes will be within methods
	private double radius;
	
	//default constructor that sets radius to 1 if no value is given
	public Circle() {
		super();
		radius = 1;
	}
	
	//custom constructor allowing assignment of radius value with passed parameter
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	//getter
	public double getRadius() {
		return radius;
	}
	
	//setter
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//returns the diameter
	public double diameter() {
		return radius*2;
	}
	
	//returns the circumference
	public double circumference() {
		return 2*Math.PI*radius;
	}
	
	//returns the area
	public double area() {
		return Math.PI*(radius*radius);
	}
	
	//bonus - returns whether or not the size of 2 circles are equal
	public boolean isEqualTo(Circle circle) {
		return this.getRadius() == circle.getRadius();
	}
	
	//toString not necessary since there is only one variable
}
