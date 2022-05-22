package com.D4_Q1;

public class Student {

	private int roll;
	private String name;
	private int age;
	private int marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int age, int marks, String name, int roll) {
		
		
		this.name = name;
		this.roll = roll;
		
		if(age>18 && age<60)
		{
			this.age = age;
		}
		
		if(marks>0 && marks<500)
		{
			this.marks = marks;
		}
	}
	
	public void setAge(int age) {
		if(age>18 && age<60)
		{
			this.age = age;
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void setMarks(int marks) {
		if(marks>0 && marks<500)
		{
			this.marks = marks;
		}
	}
	
	public int getMarks() {
		return marks;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	public int getRoll() {
		return roll;
	}
	
	public void showDetails() {
		
		System.out.println("Name is: " + name);
		System.out.println("Age is: " + age);
		System.out.println("Roll is: " + roll);
		System.out.println("Marks is: " + marks);
	}
}
