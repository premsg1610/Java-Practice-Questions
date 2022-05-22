package com.D4_Q2;

public class Demo {

	
	Demo(){
		this(15);
		System.out.println("This is the part of zero-argument constructor");
	}
	
	Demo(String str){
		this(12f);
		System.out.println("This is the part of string constructor");
	} 
	
	
	Demo(int i){
		this("Prem");
		System.out.println("This is the part of int constructor");
	}
	
	
	Demo(float f){
		System.out.println("This is the part of float constructor");
	}
	
	
	public static void main(String[] args) {
		
		Demo d1 = new Demo();
	}
	
}
