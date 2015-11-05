package com.collections;

import java.util.*;

public class AssigB {


	public static void main(String[] args) {
	String[] lang = {"Java","Ruby","Python","C","Csharp","Java"};
	Set<String> set = new HashSet<String>();
	for(String name: lang)
		if(set.add(name)==false){
			System.out.println("Found duplicate element: "+ name);
			
		}
	
	//Second way to remove duplicates
	HashSet<String> mySet = new HashSet<String>();
	ArrayList<String>names = new ArrayList<String>();
	names.add("Shruti");
	names.add("sam");
	names.add("Alex");
	names.add("Bob");
	names.add("John");
	
	for(String s:names){
		System.out.println(s);
	}
	mySet.addAll(names);
	names.clear();
	names.addAll(mySet);
	
	
	}
}




