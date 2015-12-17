package com.collections;

import java.util.*;

public class Duplicates {


	public static void main(String[] args) {
	String[] lang = {"Java","Ruby","Python","C","Csharp","Java"};
	Set<String> set = new HashSet<String>();
	for(String name: lang)
		if(set.add(name)==false){
			System.out.println("Found duplicate element: "+ name);
			
		}
	
	
	//Second way to remove duplicates
	ArrayList<String>names = new ArrayList<String>();
	HashSet<String> mySet = new HashSet<String>();
	
	names.add("Shruti");
	names.add("sam");
	names.add("Alex");
	names.add("Bob");
	names.add("Shruti");
	System.out.println("Printing arrayList of names: ");
	for(String s:names){
		System.out.println(s);
	}
	mySet.addAll(names);
	names.clear();
	names.addAll(mySet);
	System.out.println("Printing hashSet of names: ");
	for(String s:names){
		System.out.println(s);
	}
	
	
	}
}




