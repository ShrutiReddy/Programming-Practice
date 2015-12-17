package com.arrays;

import java.util.Arrays;

public class MissingNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
			int[] ip = {1,2,3,4,6,7,8,9,10}; //5 is Missing
			Arrays.sort(ip);
			
			for(int i=0; i<ip.length-1; i++)
			{
				if(i==0 && ip[i]<ip[i+1]){
					continue;
				}else if(ip[i]>ip[i-1] && ip[i]<ip[i+1] && ( (ip[i-1]+1)==ip[i]) && ( (ip[i+1]-1)==ip[i]) ){
					continue;
			}else{
					System.out.println("Missing Number is : "+(ip[i]+1));
					break;
				}
			}
			
			System.out.println("All the Numbers are present between "+ip[0]+" and "+ip[ip.length-1]);
		}//End of Main

	}


