package com.skillstorm.inclass;

public class HomeworkTest {

	public static void main(String[] args) {

		HomeworkAssignment hwa = new HomeworkAssignment("Brian", 69);
		hwa.addGrade("Jeff", 80);
		hwa.addGrade("Jeff", 88);
		hwa.addGrade("Raymond", 90);
		hwa.addGrade("Zach", -10);
		hwa.addGrade("Helga", 70);
		hwa.addGrade("Hand", 95);
		hwa.addGrade("Gander", 45);
		hwa.addGrade("Jesse", 100);
		System.out.println(hwa);
		System.out.println(hwa.lowestGrade());
		System.out.println(hwa.highestGrade());
		System.out.println(hwa.averageGrade());
		System.out.println(hwa.highestGradeStudent());
	}

}
