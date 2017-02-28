/*
 * Author: Tan Trieu
 * Last Modified: 2/28/17
 */

package shapes.main;

public class Rectangle implements Shape {

	private double height;
	private double width;
	
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	@Override
	public double getArea() {
		return height * width;
	}

	@Override
	public double getPerimeter() {
		return ((2 * height) + (2 * width));
	}
	
	public void setHeight(double h) {
		height = h;
	}
	
	public void setWidth(double w) {
		width = w;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWidth() {
		return width;
	}

}
