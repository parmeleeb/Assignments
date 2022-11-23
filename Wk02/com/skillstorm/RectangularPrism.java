package com.skillstorm;

public class RectangularPrism extends Shape {

	private double length;
	private double width;
	private double height;
	
	//constructors for RectangularPrism
	//default sets it to a cube of length 1
	public RectangularPrism() {
		super(6, 12, 8, (byte)3);
		length = 1;
		width = 1;
		height = 1;
	}

	public RectangularPrism(double length, double width, double height) {
		super(6, 12, 8, (byte)3);
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	//getters and setters for L, W, H
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	//useful methods
	public double surfaceArea() {
		return 2*length*width + 2*length*height + 2*width*height;
	}
	
	public double volume() {
		return length*width*height;
	}

	//Overriding methods from Shape
	@Override
	public boolean isPerceivable() {
		return true;
	}
	
	@Override
	public boolean isTangible() {
		return true;
	}
	
	@Override
	public boolean canInteractWith(Shape shape) {
		return shape.getDIMENSIONS()==3;
	}

	//custom overridden toString in order to show all attributes in both classes
	@Override
	public String toString() {
		return "RectangularPrism [length=" + length + ", width=" + width + ", height=" + height + ", FACES=" + this.getFACES() + 
				", EDGES=" + this.getEDGES() + ", VERTICES=" + this.getVERTICES() + ", DIMENSIONS=" + this.getDIMENSIONS() + "]";
	}
	
	
}
