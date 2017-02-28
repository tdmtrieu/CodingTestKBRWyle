/*
 * Author: Tan Trieu
 * Last Modified: 2/28/17
 */

package shapes.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import shapes.main.Circle;

public class CircleTest {
	
	Circle circle;

	@Before
	public void setUp() {
		circle = new Circle(12.4);
	}
	
	@Test
	public void testGetArea() {
		assertEquals(circle.getArea(), 483.05, 0.5);
	}
	
	@Test
	public void testGetPerimeter() {
		assertEquals(circle.getPerimeter(), 24.8, 0.5);
	}
	
	@Test
	public void testGetCircumference() {
		assertEquals(circle.getCircumference(), 77.91, 0.5);
	}
	
	@Test
	public void testGetRadius() {
		assertEquals(circle.getRadius(), 12.4, 0);
	}
	
	@Test
	public void testSetRadius() {
		circle.setRadius(35.1);
		assertEquals(circle.getRadius(), 35.1, 0);
	}

}
