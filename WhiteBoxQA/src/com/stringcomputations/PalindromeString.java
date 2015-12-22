package com.stringcomputations;

// Write a program to check for a palindrome string.

public class PalindromeString {

	public static void main(String[] args) {
		 String palindrome = "Dot saw I was Tod";
		 int len = palindrome.length();
		 //creating array of len
		 
		 char[] tempArray = new char[len];
		 
		 //second array
		 char[] reverseArray= new char[len];
		 
		 //loop 
		 for(int i=0;i<len;i++){
			 tempArray[i]= palindrome.charAt(i);
			 System.out.print(tempArray[i]);
		 }
		 System.out.println();
       // using a for loop to reversing the string
		 for(int j=0;j<len;j++){
			 reverseArray[j]=tempArray[len-1-j];
			 System.out.print(reverseArray[j]);
			 
		 }
		
		 
		 
		 
		 
		 
		 
	}

}
