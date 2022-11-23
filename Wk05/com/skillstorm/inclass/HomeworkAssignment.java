package com.skillstorm.inclass;

import java.util.HashMap;

public class HomeworkAssignment {

	private HashMap<String, Double> grades = new HashMap<>();

	public HomeworkAssignment(String student, double grade) {
		grades.put(student, grade);
	}
	
	public HashMap<String, Double> getGrades() {
		return new HashMap<>(grades);
	}
	
	public void addGrade(String student, double grade) {
		grades.put(student, grade);
	}
	
	public String highestGradeStudent() {
		String maxStudent = "";
		double maxGrade = 0;
		for(String student : grades.keySet()) {
			if(grades.get(student) > maxGrade) {
				maxGrade = grades.get(student);
				maxStudent = student;
			}
		}
		return maxStudent;
	}
	
	public double highestGrade() {
		double maxGrade = 0;
		for(double grade : grades.values()) {
			maxGrade = Math.max(grade, maxGrade);
		}
		return maxGrade;
	}
	
	public double lowestGrade() {
		double minGrade = 0;
		for(double grade : grades.values()) {
			if(grade < minGrade)
				minGrade = grade;
		}
		return minGrade;
	}
	
	public double averageGrade() {
		double total = 0;
		for(double grade : grades.values()) {
			total += grade;
		}
		return (total/grades.size());
	}
	
	public String toString() {
		return grades.toString();
	}
}
