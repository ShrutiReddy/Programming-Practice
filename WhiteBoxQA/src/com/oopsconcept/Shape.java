package com.oopsconcept;

// Write a program creating an abstract class Shape with properties (noOfSides,area,perimeter) 
//and methods(calculateArea,calculatePerimeter,setSides).

public abstract class Shape {
   //properties
	private double noOfSides;
	private double area;
	private double perimeter;
 //set method
	public void setNoOfSides(double noOfSides) {
		this.noOfSides = noOfSides;
	}
	
	//abstract method to calculate area and perimeter which have to be implemented by the 
	//child classes which extends the shape class.
	public abstract double area();
	
	public abstract double perimeter();
}
