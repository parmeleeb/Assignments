package com.skillstorm;

import java.util.ArrayList;

public class Programmer{

	//class variables
	private String name;
	private String company;
	//arraylist of languages
	private ArrayList<String> languages = new ArrayList<String>();
	
	//constructor allowing you to start with 1 known language
	public Programmer(String name, String company, String language) throws IllegalArgumentException{
		this.name = name;
		this.company = company;
		//checks validity of language before adding to languages arraylist
		languages.add(checkValid(language));
	}
	
	//constructor allowing you to start with an ArrayList of known languages
	public Programmer(String name, String company, ArrayList<String> languages) throws IllegalArgumentException{
		this.name = name;
		this.company = company;
		//checks validity of language before adding to languages arraylist
		this.languages = checkValid(languages);
	}
	
	//copy constructor as discussed in class on 21 OCT (not necessary for the assignment, but good habit)
	public Programmer(Programmer otherProgrammer) {
		this.name = otherProgrammer.name;
		this.company = otherProgrammer.company;
		//no need to check validitiy since incoming Programmer class cannot contain invalid values
		this.languages = new ArrayList<>(otherProgrammer.languages);
	}
	
	//getters and setters (no setter for languages because arraylist)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public ArrayList<String> getLanguages() {
		return new ArrayList<String>(languages);
	}

	//checks validity and adds language to arraylist
	public void addLanguage(String language) throws IllegalArgumentException{
		language = checkValid(language);
		languages.add(language);
	}
	
	//removes the passed language to arraylist
	public void removeLanguage(String language) {
		languages.remove(language);
	}
	
	/*
	 * checks validity of language parameter
	 * helper method, so it stays private
	 * also returns the cleaned up language String
	 * throws exception all the way up and out of the Programmer class
	*/
	private String checkValid(String language) throws IllegalArgumentException{
		
		//if language is null, throws an exception
		if(language == null)
			throw new IllegalArgumentException("You must give a valid value for language");
		
		//removes the whitespace from the String to make comparing it easier
		language = language.trim();
		
		//removes the language from the current list of languages to avoid duplicates
		//it will then be appended after the check is done
		languages.remove(language);
		
		//if language is empty, throws an exception
		if(language.isEmpty())
			throw new IllegalArgumentException("You must give a valid value for language");
		return language;
	}
	
	//polymorphic alternative for checkValid that intakes an ArrayList of 
	private ArrayList<String> checkValid(ArrayList<String> languages)throws IllegalArgumentException{
		
		//the data of the passed value is copied into a local ArrayList to perform the functions of the class
		ArrayList<String> validLanguages = new ArrayList<>(languages);
		
		//sets the value of each of the items in the array to a trimmed version, thanks to checkValid
		//also checks the validity of each item and throws exeption if not
		for(int i = 0; i < languages.size(); i++) {
			validLanguages.set(i,checkValid(validLanguages.get(i)));
		}
		return validLanguages;
	}
	
	//returns a string of all the values of the Programmer class
	public String toString() {
		return "Programmer [name=" + name + ", company=" + company + ", languages=" + languages.toString() + "]";
	}

	
}
