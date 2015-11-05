package com.collections;

import java.util.*;

public class Assign1ArrayList {

	public static void main(String[] args) {
		// Creating an arraylist with elments of names in it
		ArrayList<String> names = new ArrayList<String>();
		names.add("John");
		names.add("Smith");
		names.add("Lee");
		names.add("Wang");
		names.add("Alex");

		System.out.println(names);
		// Searching for an element in the list
		if (names.contains("Smith"))
			System.out.println("Name found");
		else
			System.out.println("Name not found");
		// Printing the elements of the list using iterator
		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());

		// Printing the list in reverse order using the iterator
		ListIterator<String> listIterator = names.listIterator(names.size());
		System.out.println("Printing the list in reverse order: ");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}

}
