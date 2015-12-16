package com.loops;

public class PrimeNumberorNot {
 public boolean isPrimeNumber(int number){
	 
	 for(int i=2;i<= number/2;i++){
		 if(number%i==0){
			 return false;
		 }
	 }
	 return true;
	 
 }


	
	public static void main(String[] args) {
		PrimeNumberorNot num = new PrimeNumberorNot();
		System.out.println("2 is a Prime Number:"+ num.isPrimeNumber(2));
		System.out.println("7 is a Prime Number:"+ num.isPrimeNumber(7));
		System.out.println("12 is a Prime Number:"+ num.isPrimeNumber(12));
		System.out.println("17 is a Prime Number:"+ num.isPrimeNumber(17));
		
		
	}
		
		

	}

