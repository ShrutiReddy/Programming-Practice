package com.collections;
/*
 * Write a program that defines an enum having months of the year and then prints the value of 
  		all the enum elements.
 */
public class EnumMonths {
   //Creating an enum of months in a year
	public enum Month
	{
	  JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
	  JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
	}
	public static void main(String[] args) {
		//Using an enhanced for loop to print the enum values
		for(Month m: Month.values()){
			System.out.println(m);
		}
	

	}

}
