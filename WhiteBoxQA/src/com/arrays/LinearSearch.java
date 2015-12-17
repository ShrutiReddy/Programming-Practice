package com.arrays;



public class LinearSearch {

public static void search(int [] arr1, int key){
	for(int i=0;i<arr1.length;i++){
		if( arr1[i] == key){
			System.out.println(i);
		}
	}
}
	public static void main(String[] args) {
		
		int[] arr ={1,2,3,4,5,6};
		LinearSearch.search(arr, 4);// calling the linearSearch function

	}

}
