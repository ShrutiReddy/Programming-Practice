package com.oopsconcept;
/*Write a program that creates a class Circle extending Shape abstract class and implementing ShapeConstants 
  		interface and has following behavior.
  			--> Properties: radius.
  			--> Constructor: To set number of sides.
  			--> Overrides all the methods from parents.
 */

public class Circle extends Shape implements ShapeConstants {
	



	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double radius;
	

	@Override
	public double area() {
		 return pi * Math.pow(radius, 2);
	}

	@Override
	public double perimeter() {
		 return 2 * pi * radius;
	}

	

}
