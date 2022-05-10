package com.selenium.learnings;

//variables/data types, if

public class JavaDay2 {

	//Data Types
	//Integer - Ex:10, 20, 30 
	//Float - Decimals Ex:- 10.01
	//Long - Big numbers Ex:- 34560913475
	//Character - Single letter Ex:- 's'
	//String - Word Ex- "Rock"
	//Boolean - True/False
	
	
	static int number;
	static boolean status;
	static String result;
	
	public static void main(String[] args) {
		
		result="Pass";
		
		//practiceIfOne();
		//practiceIfTwo();
		
		forLoop();
	}
	
	public static void practiceIfOne() {
		if(result=="Pass") {
			status=true;
		} else {
			status=false;
		}
		
		System.out.println(status);
	}
	
	public static void practiceIfTwo() {
		char letter = 'a';
		
		if(letter=='a') {
			number=1;
		} else if(letter=='b') {
			number=2;
		} else if(letter=='c') {
			number=3;
		} else {
			number=4;
		}
		
		System.out.println(number);
	}

	public static void forLoop() {
		for(int num=1; num<=10; num++) {
			System.out.println(num);
		}
	}
	
	//print only odd numbers
	//print fibonocci series until number reaches 100

}
