package com.skillstorm.athletes;

import java.util.Collections;
import java.util.LinkedList;

public class AthleteTest {

	public static void main(String[] args) {
		Athlete jason = new Athlete("Jason", 1, 8);
		Athlete alex = new Athlete("Alex", 1, 0);
		Athlete brittany = new Athlete("Brittany", 15, 15);
		Athlete jason2 = new Athlete("Jason", 30, 0);
		Athlete heather = new Athlete("Heather", 16, 20);
		Athlete alex2 = new Athlete("Alex", 10, 6);
		Athlete noName = new Athlete(null, 10, 1);
		Athlete frampton = new Athlete("Frampton", 32, 15);
		
		LinkedList<Athlete> athleteList = new LinkedList<Athlete>();
		athleteList.add(jason);
		athleteList.add(alex2);
		athleteList.add(brittany);
		athleteList.add(jason2);
		athleteList.add(heather);
		athleteList.add(alex);
		athleteList.add(noName);
		athleteList.add(frampton);
		
		System.out.println(athleteList);
		
		Collections.sort(athleteList, new WinLossRatioComparator());
		
		System.out.println(athleteList);
		
	}
}
