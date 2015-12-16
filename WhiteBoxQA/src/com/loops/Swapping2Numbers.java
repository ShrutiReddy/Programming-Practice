package com.loops;

public class Swapping2Numbers {
    //Swapping numbers without third variable
	public static void swapNumbers(int a, int b){
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The value of a: "+ a +"The value of B: "+b);
		
	}
	  //Swapping numbers using a third variable c
	public static void swapNumbersWithVariable(int a, int b){
		//int a=20,b=30;
		int c;
		c=a+b;//c is 50
		b=c-b;//b is 20
		a=c-a;//a is 30
		System.out.println("The value of a: "+ a +"The value of B: "+b);
		
	}
	public static void main(String[] args) {
		Swapping2Numbers.swapNumbers(30, 70);
		Swapping2Numbers.swapNumbersWithVariable(60, 40);
		
		
		

	}

}
