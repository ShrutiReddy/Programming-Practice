package com.stringcomputations;
import java.util.*;

public class StringTokenizerexample {

	public static String addIntegers(String s){

		
		String res = new String();
		int i=1;
		StringTokenizer t = new StringTokenizer(s);
		while( t.hasMoreTokens() ){
		res += t.nextToken();
		res +=i;
		res +=" ";
		i++;
		}
        
		return res;

		}
	
	public static void main(String[] args) {
		System.out.println(StringTokenizerexample.addIntegers("This is nice"));
		
		
		

		

	}

}
