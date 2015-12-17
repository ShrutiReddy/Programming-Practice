package com.arrays;

public class LargestNumber {

	public static void main(String[] args) {
		int largest=0;
		int[] array={23,44,67,300,2,50,789};
		for(int i=0;i<=array.length;i++){
			if(array[i]>largest){
				largest=array[i];
				
				
				
			}
		}
		System.out.println(largest);

	}

}
