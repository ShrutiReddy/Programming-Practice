package com.stringcomputations;

public class ReplaceSubstring {
	
	//Write a program to find a substring in a given string and then replace it with another string.
      public static void replaceString(String str){
    	String sub=str.substring(6);
    	 str=str.replace(sub, "Shruti");
    	
    	System.out.println(str);
	
}
	public static void main(String[] args) {
		replaceString(" hello world");
		

	}

}
