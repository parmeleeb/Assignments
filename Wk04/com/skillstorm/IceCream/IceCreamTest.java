package com.skillstorm.IceCream;

import java.util.ArrayList;
import java.util.Objects;

public class IceCreamTest {

	public static void main(String[] args) {
		IceCream strawberry = new IceCream("strawberry", false, true);
		IceCream rockyRoad = new IceCream("rocky road", false, false);
		IceCream orangeSherbert = new IceCream("orange sherbert", true, true);
		IceCream orangeSherbert2 = new IceCream("orange sherbert", true, true);
		System.out.println(strawberry);
		System.out.println(rockyRoad);
		System.out.println(orangeSherbert);
		System.out.println();
		
		Customer bob = new Customer("Bob", 15, orangeSherbert, 2);
		Customer jane = new Customer("Jane", 6, rockyRoad, 3);
		Customer sean = new Customer("Sean", -5, strawberry, 0);
		System.out.println(bob);
		System.out.println(jane);
		System.out.println(sean);
		System.out.println();
		
		ArrayList<IceCream> iceCreams = new ArrayList<>();
		iceCreams.add(rockyRoad);
		iceCreams.add(strawberry);
		iceCreams.add(orangeSherbert2);
		
		IceCreamShop braums = new IceCreamShop(iceCreams, 2);
		braums.addCustomer(bob);
		braums.addCustomer(jane);
		braums.addCustomer(sean);
		System.out.println(braums);
		
		braums.serviceCustomer();
		System.out.println(bob);
		System.out.println(braums);
		System.out.println();
		
		braums.serviceCustomer();
		System.out.println(jane);
		System.out.println(braums);
		System.out.println();
		
		braums.serviceCustomer();
		System.out.println(sean);
		System.out.println(braums);
		System.out.println();
		
		System.out.println(braums.getAvailableIceCreams());
		braums.addFlavor(orangeSherbert);
		System.out.println(braums.getAvailableIceCreams());
		braums.removeFlavor(orangeSherbert);
		System.out.println(braums.getAvailableIceCreams());
		braums.removeFlavor(orangeSherbert);
		System.out.println(braums.getAvailableIceCreams());
		braums.addFlavor(orangeSherbert);
		System.out.println(braums.getAvailableIceCreams());
		braums.removeFlavor(strawberry);
		System.out.println(braums.getAvailableIceCreams());
		
		System.out.println("This should be true " + orangeSherbert.equals(orangeSherbert2));
		
		Integer a = new Integer(1);
		Integer b = new Integer(1);
		
		System.out.println("This should be true: " + a.equals(b));
		
		System.out.println(Objects.equals(a,b));
		
		System.out.println();
		
		Person brian = new Person("Brian", 27);
		Person brianAgain = new Person("Brian", 27);
		boolean result;
		
		Object object1 = new Object();
		Object object2 = new Object();
		
		result = object1 == object2;
		
		result = object1.equals(object2);
		
		result = brian.equals(brianAgain);
		//result will be false
		
		brian = brianAgain;
		
		result = brian.equals(brianAgain);
		//result is now true
		
		System.out.println(result);
	}
}
