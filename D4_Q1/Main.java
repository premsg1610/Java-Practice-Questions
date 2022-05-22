package com.D4_Q1;

public class Main {

	public static void main(String[] args) {
		
//		using zero argument constructor
		Student s1 = new Student();
		
		s1.setName("Prem");
		s1.setAge(24);
		s1.setRoll(45);
		
		int marks = 24;
		s1.setMarks(marks);
		
		
		
		System.out.println("Name is: " + s1.getName());
		System.out.println("Age is: " + s1.getAge());
		System.out.println("Roll is: " + s1.getRoll());
		System.out.println("Marks is: " + s1.getMarks());
		
		
//		using parameterized constructor
		
		Student s2 = new Student(25,200,"Priyanka",46);
		s2.showDetails();
	}
}
