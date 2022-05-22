package com.D4_Q4;

public class Java {

	int number;
	
	void checkWholeNum(int number) {
		
		if(number >= 0 && number%2 != 0)
		{
			System.out.println(number);
		}
		else if(number >= 0 && number%2 == 0)
		{
			System.out.println(number+(10-number%10));
		}
		else {
			System.out.println("Error");
		}
	}
	
	public static void main(String[] args) {
		
		Java obj = new Java();
		
		obj.number = 25;
		obj.checkWholeNum(obj.number);
		
		 obj.number = 12;
		 obj.checkWholeNum(obj.number);
		 
		 obj.number = -5;
		 obj.checkWholeNum(obj.number);
		 
		
	}
}
