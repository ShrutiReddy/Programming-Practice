package com.arrays;

public class MergeArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = { 10, 20, 30 };//Array 1
		int[] b = { 40, 50, 60 };//Array 2
		int[] c = merge(a, b);//Array c to merge both
		for (int i = 0; i < c.length; i++)//loop to print the array
			System.out.println(c[i]);
	}

	public static int[] merge(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		int i;
		for (i = 0; i < a.length; i++)
			c[i] = a[i];

		for (int j = 0; j < b.length; j++)
			c[i++] = b[j];
		return c;
	}
}
