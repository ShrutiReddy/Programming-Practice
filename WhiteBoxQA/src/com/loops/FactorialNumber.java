package com.loops;

public class FactorialNumber {
	//A method to calculate the factorial of a given number using recursion
	public static int factorial(int f) {
	       if (f == 0) {
	           return 1;
	       } else {
	           return f * factorial(f - 1);
	       }
	   }

	public static void main(String[] args) {
		//A program to calculate the factorial of a given number without using recursion
		int n =7;
		int result=1;
		
		for(int i=1;i<=n;i++){
			result = result * i;
			System.out.println("The factorial of 7 is:" + result);
		}
		//calling the factorial method using recursion
		int f = 4;
	       int results = factorial(n);
	       System.out.println("The factorial of 7 is " + results);

	}

}
