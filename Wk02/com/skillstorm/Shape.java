package com.skillstorm;

public abstract class Shape {

	//these values are final because, assuming you name your shape appropriately,
	//these values will always be the same for a given shape
	private final int FACES;
	private final int EDGES;
	private final int VERTICES;
	private final byte DIMENSIONS;
	
	//no default constructor because there is no real good default shape, plus I can't leave the "final" variables blank
	public Shape(int FACES, int EDGES, int VERTICES, byte DIMENSIONS) {
		super();
		this.FACES = FACES;
		this.EDGES = EDGES;
		this.VERTICES = VERTICES;
		this.DIMENSIONS = DIMENSIONS;
	}

	//Getters (no setters) since the values should not be changed once set
	public int getFACES() {
		return FACES;
	}

	public int getEDGES() {
		return EDGES;
	}

	public int getVERTICES() {
		return VERTICES;
	}

	public byte getDIMENSIONS() {
		return DIMENSIONS;
	}
	
	//determines if your shape is able to be perceived with human senses
	public abstract boolean isPerceivable();
	
	//determines if your shape is able to be touched by humans
	public abstract boolean isTangible();
	
	//determines if the passed object is able to interact with your object (same dimension)
	public abstract boolean canInteractWith(Shape shape);

	//generated toString method
	@Override
	public String toString() {
		return "Shape [FACES=" + FACES + ", EDGES=" + EDGES + ", VERTICES=" + VERTICES + ", DIMENSIONS=" + DIMENSIONS
				+ "]";
	}
	
}
