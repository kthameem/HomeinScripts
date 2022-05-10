package com.selenium.learnings;

public class JavaDay3 extends JavaDay1{

	
	//1) Array & List & 2) Inheritance
	//List Collection of data. Ex:- Subject = [Maths, English, Science] Marks = [100, 98, 50]
	
	static JavaDay2 mySibling;
	
	static String[] subjects = {"Engilsh", "Maths", "Science", "Tamil"};
	
	public static void main(String[] args) {

		//printName("Thameem");
		//addNumbers(2, 3);
		
		//addNumbers(2, 3, 4);
		
		mySibling = new JavaDay2();
		
		//mySibling.forLoop();
		
		System.out.println(subjects.length);
		
		//1) index - 0, 0<=4 - True Print
		//2) index - 1, 1<=4 - True print
		//3) index - 2, 2<=4 - True print
		//4) index - 3, 3<4 - True print
		//5) index - 4, 4<4 - False Exit from loop
		
		for(int index=0; index<subjects.length; index++) {
			System.out.println(subjects[index]);
		}
		
	}
	
	
	
	public static void addNumbers(int a, int b, int c) {
		System.out.println("Local Method " + a+b+c);
	}
	
	public static void addNumbers(int a, int b, int c, int d) {
		System.out.println("Local Method " + a+b+c);
	}
	
	//Print Fibonocci series using Array <100

}
