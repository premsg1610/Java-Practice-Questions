package com.masai;

public class Demo {

	int x = 10;
	
	void funX() {
		System.out.println("inside funX of Demo");	
	}
	
	public static void main(String[] args) {
		
//		Demo d1 = new Demo();
//		d1.funX();
//		after this statement object will remain in memory until the variable remain in memory.
//		this method is helpful when we create object one time and call it as many time we want
//		like d1.funX() anywhere in the program.
		
		new Demo().funX();
//		it is known us unreferenced object.
//		object is created and function is called 
//		after this statement object will be destroyed therefore fast
//		used when we want use object only one time.
//		if we use this method for multiple time then every time object will be created and
//		object creation is the costly thing in java.
	}
}
