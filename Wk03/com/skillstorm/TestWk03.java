package com.skillstorm;

import java.util.ArrayList;

public class TestWk03 {

	public static void main(String[] args) {
		
		ArrayList<String> knownLanguages = new ArrayList<>();
		
		knownLanguages.add("C");
		knownLanguages.add("C++");
		knownLanguages.add("Python");
		
		try {
		Programmer p1 = new Programmer("Steve", "Microsoft", "Java");
		System.out.println(p1.toString());
		Programmer p2 = new Programmer("William", "Apple", knownLanguages);
		System.out.println(p2.toString());
		
		p1.addLanguage("C");
		System.out.println(p1.getLanguages().toString());
		p1.addLanguage("Java");
		System.out.println(p1.getLanguages().toString());
		p2.addLanguage("   .          ");
		System.out.println(p2.getLanguages().toString());
		p2.addLanguage(null);
		System.out.println("No thank you");
		
		}
		catch(IllegalArgumentException e) {
			System.err.println(e.getMessage());
			System.out.println("No thank you");
		}
		System.out.println("No thank you");
	}
}
