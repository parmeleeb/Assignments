package com.skillstorm;

public class Test {

	public static void main (String[] args) {

		RectangularPrism box = new RectangularPrism(2, 3, 4);
		RectangularPrism cube = new RectangularPrism();
		

		System.out.println(box.toString());
		System.out.println(cube.toString());
		System.out.println();
		
		System.out.println(box.getEDGES());
		System.out.println(box.getFACES());
		System.out.println(box.getVERTICES());
		System.out.println(box.getDIMENSIONS());
		System.out.println();

		System.out.println(box.isPerceivable());
		System.out.println(box.isTangible());
		System.out.println();
		
		System.out.println(cube.canInteractWith(box));
		System.out.println();
		
		System.out.println(box.volume());
		System.out.println(box.surfaceArea());
		System.out.println();
		
		System.out.println(cube.volume());
		System.out.println(cube.surfaceArea());
		System.out.println();
		
		
	}
}
