package com.loops;

public class PrintingPattern {

	
	public static void main(String[] args) {
		for(int rows=1; rows<=10;rows++){
			for(int numberOfStars = 1;numberOfStars<=rows;numberOfStars++){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
