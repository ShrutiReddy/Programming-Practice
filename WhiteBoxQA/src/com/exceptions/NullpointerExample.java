package com.exceptions;

public class NullpointerExample {

	
	public static void main(String[] args) {
		String name =null;
		try{
			System.out.println("The Student name is:" + name.toString());
		}catch(NullPointerException e){
			System.out.println("error occured");
			e.printStackTrace();
		}catch(Exception e){
			System.out.println(e);
		}finally{
			System.out.println("Printing student name");
		}
	}
	}
	

	



	


