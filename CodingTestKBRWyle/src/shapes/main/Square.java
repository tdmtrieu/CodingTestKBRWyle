/*
 * Author: Tan Trieu
 * Last Modified: 2/28/17
 */

package shapes.main;

public class Square implements Shape {

	double length;
	
	// only one parameter is needed because both height and width must be the same length for a square
	public Square(double length) {
		this.length = length;
	}
	
	@Override
	public double getArea() {
		return length * length;
	}

	@Override
	public double getPerimeter() {
		return length * 4;
	}
	
	public double getHeight() {
		return length;
	}
	
	public double getWidth() {
		return length;
	}
	
	public void setHeight(double h) {
		length = h;
	}
	
	public void setWidth(double w) {
		length = w;
	}

}
