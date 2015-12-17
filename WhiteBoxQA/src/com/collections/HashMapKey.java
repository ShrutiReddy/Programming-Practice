package com.collections;
import java.util.*;
/*
 * Write a program having below methods.
  			--> To create a hashmap.
  			--> To search for a key in the created map and then returns its value.
 */

public class HashMapKey {

	public static void main(String[] args) {
		//Creating an HAshMAp with key value as integer and string
		HashMap<Integer, String> id= new HashMap<Integer, String>();
		id.put(1, "java");
		id.put(2, "Ruby");
		id.put(3, "Python");
		id.put(4, "CSharp");
		id.put(5, "JavaScript");
		
        System.out.println("The size of this HasMap is: "+id.size());
		if(id.containsKey(4))
			System.out.println("The value of 4 is: "+ id.get(4));
		else
			System.out.println("No such key found");
		

	}

}
