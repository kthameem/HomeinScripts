package com.selenium.learnings;

import java.util.ArrayList;
import java.util.List;

public class JavaDay5Part1 {

	public static void main(String[] args) {

		//List
		
		List <String> myToDoList = new ArrayList<String>();
		
		myToDoList.add("Take Selenium Session in the morning");
		myToDoList.add("Buy Groceries");
		myToDoList.add("Repair Water Motor");
		
		
		for(int i=0; i<myToDoList.size(); i++) {
			System.out.println(myToDoList.get(i));
		}
		
		myToDoList.remove(0);
		
		myToDoList.add(0, "Hello");
		
		for(String eachItemInList : myToDoList) {
			System.out.println(eachItemInList);
		}

	}

}
