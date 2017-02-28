/*
 * Author: Tan Trieu
 * Last Modified: 2/28/17
 */

package shapes.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import shapes.main.Rectangle;

public class RectangleTest {

	Rectangle rectangle;
	
	@Before
	public void setUp() {
		rectangle = new Rectangle(15.0, 7.3);
	}
	
	@Test
	public void testGetArea() {
		assertEquals(rectangle.getArea(), 109.5, 0.5);
	}
	
	@Test
	public void testGetPerimeter() {
		assertEquals(rectangle.getPerimeter(), 44.6, 0.5);
	}
	
	@Test
	public void testSetHeight() {
		rectangle.setHeight(2.0);
		assertEquals(rectangle.getHeight(), 2.0, 0);
	}
	
	@Test
	public void testSetWidth() {
		rectangle.setWidth(100.9);
		assertEquals(rectangle.getWidth(), 100.9, 0);
	}
	
	@Test
	public void testGetHeight() {
		assertEquals(rectangle.getHeight(), 15.0, 0);
	}
	
	@Test
	public void testGetWidth() {
		assertEquals(rectangle.getWidth(), 7.3, 0);
	}

}
