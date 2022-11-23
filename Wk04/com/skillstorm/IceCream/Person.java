package com.skillstorm.IceCream;

public class Person{

	private String name;
	
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || !(obj instanceof Person))
			return false;
		Person personObj = (Person)obj;
		return this.getName().equals(personObj.getName())
				&& this.getAge() == personObj.getAge();
	}
	
	public String toString() {
		return "Person [name = " + name + ", age = " + age + "]";
	}

}
