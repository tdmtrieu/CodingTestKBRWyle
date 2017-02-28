/*
 * Author: Tan Trieu
 * Last Modified: 2/28/17
 */

package shapes.main;

public class Circle implements Shape {

	private final double PI = 3.1415;
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return (PI * (radius * radius));
	}

	@Override
	//getPerimeter serves the same purpose as a getDiameter() method
	public double getPerimeter() {
		return radius * 2;
	}
	
	public double getCircumference() {
		return 2 * PI * radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double r) {
		radius = r;
	}

}
