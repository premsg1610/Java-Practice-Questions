package com.D4_Q3;

public class Demo {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		Student prem = s1.getStudent(true);
		
		
//		System.out.println(prem);
//		System.out.println(priyanka);
		
		System.out.println("Name: " + prem.name);
		System.out.println("Roll: " + prem.roll);
		System.out.println("Address: " + prem.address);
		System.out.println("CollegeName: " + prem.collageName);
		
		
		Student priyanka = s1.getStudent(false);
		
		System.out.println("Name: " + priyanka.name);
		System.out.println("Roll: " + priyanka.roll);
		System.out.println("Address: " + priyanka.address);
		System.out.println("CollegeName: " + priyanka.collageName);
	}
}
