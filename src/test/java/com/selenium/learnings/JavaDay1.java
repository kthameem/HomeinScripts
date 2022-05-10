package com.selenium.learnings;

//Session One - Classes & Methods

public class JavaDay1 {
	

	public static void main(String[] args) {
		
		printName("Mike");
		printName("Thameem");
		printName("Dayalan");
		
		
		System.out.println(addNumbers(10, 10));
		

		multiplyBy2(addNumbers(6, 7));
	}
	
	
	public static void printName(String name) {
		System.out.println(name);
	}
	
	public static int addNumbers(int a, int b) {
		int total = a + b;
		System.out.println("Within Method " +total);
		return total;
	}
	
	public static void multiplyBy2(int total) {
		System.out.println(total*2);
	}
	
	

}
