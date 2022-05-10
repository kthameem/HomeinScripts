package com.selenium.learnings;

public class JavaDay4Part1 {

	public static void main(String[] args) {
		
		fibonocciSeries(50);

	}
	
	public static void fibonocciSeries(int seriesCount) {
		
		long[] fib = new long[seriesCount];
		
		fib[0]=0;
		fib[1]=1;
		
		for(int i=2; i<seriesCount; i++) {
			fib[i] = fib[i-2] + fib[i-1];
		}
		
		for(int i=0; i<seriesCount; i++) {
			System.out.println(fib[i]);			
		}
	}

}
