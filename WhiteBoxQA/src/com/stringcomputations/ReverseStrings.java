package com.stringcomputations;

public class ReverseStrings {
	
	public static void reverse(String str){
		for(int i=str.length()-1;i>=0;i--){
			System.out.print(str.charAt(i));
		}
	}


	public static void main(String[] args) {
		reverse("Hello World");
	
		
		
	}

}
