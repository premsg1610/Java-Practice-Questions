package com.D4_Q3;

public class Student {

	int roll;
	String name;
	String address;
	String collageName;
	
	public Student() {
		
	}
	public Student(int roll,String name,String address) {
		this.roll = roll;
		this.name = name;
		this.address = address;
	}
	public Student(int roll,String name,String address,String collageName) {
			this.roll = roll;
			this.name = name;
			this.address = address;
			this.collageName = collageName;
		}
		
	public static Student getStudent(boolean isFromNIT) {
		
		if(isFromNIT == true)
		{
			Student s1 = new Student(24,"Prem","Delhi");
			s1.collageName = "NIT";
			return s1;
		}
		else {
			Student s1 = new Student(25,"Priyanka","Delhi","IIT");
			return s1;
		}
	}
}
