package com.loops;
import java.util.*;

public class InputFromCommandLine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int print = sc.nextInt();
		for(int i=0;i<=print;i++){
			System.out.println(i);
		}
	sc.close();

	}

}
