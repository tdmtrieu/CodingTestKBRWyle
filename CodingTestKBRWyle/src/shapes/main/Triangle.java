/*
 * Author: Tan Trieu
 * Last Modified: 2/28/17
 */

package shapes.main;

public class Triangle implements Shape {

	private double side1;
	private double side2;
	private double side3;
	
	public Triangle(double first, double second, double third) {
		side1 = first;
		side2 = second;
		side3 = third;
	}
	
	@Override
	public double getArea() {
		double perimeter = getPerimeter();
		double area = Math.sqrt(perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3));
		return area;
	}

	@Override
	public double getPerimeter() {
		return (side1 + side2 + side3) / 2;
	}
	
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	public double getSide1() {
		return side1;
	}
	
	public double getSide2() {
		return side2;
	}
	
	public double getSide3() {
		return side3;
	}
	
	

}
