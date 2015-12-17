package com.collections;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SortMapbyValue {

	/**
	 * Write a program to sort a map by value.
	 */
	public static void main(String[] args) {
	HashMap<Integer, String> hmap = new HashMap<Integer, String>();
    hmap.put(5, "G");
    hmap.put(1, "A");
    hmap.put(4, "E");
    hmap.put(2, "C");
    hmap.put(6, "B");
    hmap.put(3, "F");
    hmap.put(7, "D");
    System.out.println("Before Sorting:");
    Set set = hmap.entrySet();
    Iterator iterator = set.iterator();
    while(iterator.hasNext()) {
         Map.Entry me = (Map.Entry)iterator.next();
         System.out.print(me.getKey() + ": ");
         System.out.println(me.getValue());
    }
    Map<Integer, String> map = sortByValues(hmap); 
    System.out.println("After Sorting:");
    Set set2 = map.entrySet();
    Iterator iterator2 = set2.iterator();
    while(iterator2.hasNext()) {
         Map.Entry me2 = (Map.Entry)iterator2.next();
         System.out.print(me2.getKey() + ": ");
         System.out.println(me2.getValue());
    }
}

private static HashMap sortByValues(HashMap map) { 
     List list = new LinkedList(map.entrySet());
     // Defined Custom Comparator here
     Collections.sort(list, new Comparator() {
          public int compare(Object o1, Object o2) {
             return ((Comparable) ((Map.Entry) (o1)).getValue())
                .compareTo(((Map.Entry) (o2)).getValue());
          }
     });

     // Here I am copying the sorted list in HashMap
     // using LinkedHashMap to preserve the insertion order
     HashMap sortedHashMap = new LinkedHashMap();
     for (Iterator it = list.iterator(); it.hasNext();) {
            Map.Entry entry = (Map.Entry) it.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
     } 
     return sortedHashMap;
}
}