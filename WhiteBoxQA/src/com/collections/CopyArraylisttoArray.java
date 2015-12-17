package com.collections;
import java.util.*;

public class CopyArraylisttoArray {

	//Program to copy an arraylist to an array
	public static void main(String[] args) {
		//First way to copy arrayList to array
		ArrayList<String> names = new ArrayList<String>();
		names.add("John");
		names.add("Alex");
		names.add("Sam");
		names.add("Smith");
		names.add("Cathy");
		System.out.println("ArrayList = "+names);
		String[] name = new String[names.size()];
		names.toArray(name);
		System.out.println("Created array content");
		for(String str: names){
			System.out.println(str);
		}
		
		//Second way to copy arrayList to array
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		System.out.println("ArrayList = "+ numbers);
		//Creating an array
		int[] num = new int[numbers.size()];
		for(int i =0; i<numbers.size();i++){
			num[i]=numbers.get(i);
		}
			//Display array elements
			for(int n:num){
				System.out.println(n);
			}
			
			
		}
		}
		
		
			
	

	


