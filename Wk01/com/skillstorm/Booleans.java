package com.skillstorm;

import java.util.Scanner;

public class Booleans {

	public static void main(String[] args) {
		
		//using scanner because I want to practice with it
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many hours of sleep do you get per night (rounded to nearest whole number): ");
		int sleep = sc.nextInt();
		
		System.out.print("How many hours do you exercise per week (rounded to nearest whole number): ");
		int exercise = sc.nextInt();
		
		System.out.print("How many hours do you work per week (rounded to nearest whole number): ");
		int work = sc.nextInt();
		
		//alert if too little sleep
		//alert if too much work or not enough
		//alert if too little or too much exercise
		//alert if sleep to work ratio is below 1:1
		//congratulate if all numbers are good
		
		if(sleep <= 5) {
			System.out.println("You need to get more sleep. Come back when you're not so tired.");
		}
		else {
			if(work > 50) {
				System.out.println("Take a break some time. Come back when you take care of yourself.");
			}
			else if(work > 20){
				if(exercise < 2) {
					System.out.println("You need to be mroe active. Come back when you stop being a couch potato.");
				}
				else if(exercise >= 14) {
					System.out.println("Woah give your body a break. You're not Herecles.");
				}
				else {
					if(sleep * 7 > work) {
						System.out.println("Good job! You're living a normal healthy life.");
					}
					else if(sleep * 7 == work) {
						System.out.println("Perfectly balanced, as all things should be...");
					}
					else {
						System.out.println("You're cutting it close. You need to cut back at work or get a little more sleep.");
					}
				}
			}
			else {
				System.out.println("Listen, I know work sucks, but you gotta try a little harder than that.");
			}
		}
		sc.close();

	}

}
