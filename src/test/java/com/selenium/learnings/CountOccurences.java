package com.selenium.learnings;

public class CountOccurences
{
  public static void main(String args[]) 
  {
      
  String input = "aabcAd";
  char search = 'a';             // Character to search is 'a'.
  
  boolean result = false;
  
  int count=0;
  for(int i=0; i<input.length()-1; i++)
  {
      if(input.charAt(i) == search)
      count++;
  }
  
  System.out.println("The Character '"+search+"' appears "+count+" times.");
  }
}