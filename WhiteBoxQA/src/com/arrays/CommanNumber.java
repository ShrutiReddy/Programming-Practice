package com.arrays;

public class CommanNumber {

	
	public static void main(String[] args) {
		//program to print the common objects in 2 given arrays
		
		String[] basket1={"car","plane","truck","bike","trike","cart"};
		String[] basket2={"doll","plane","truck","teddy","crayon","cart"};
		
		for(int i=0;i<basket1.length;i++){
			for(int j=0;j<basket2.length;j++){
				if(basket1[i]==basket2[j]){
					System.out.println(basket1[i]);
				}
			}
		}
		

	}

}
