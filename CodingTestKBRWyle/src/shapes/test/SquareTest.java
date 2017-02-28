/*
 * Author: Tan Trieu
 * Last Modified: 2/28/17
 */

package shapes.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import shapes.main.Square;

public class SquareTest {

	private Square square;
	
	@Before
	public void setUp() {
		square = new Square(10);
	}
	
	@Test
	public void testGetArea() {
		assertEquals(square.getArea(), 100, 0.5);
	}
	
	@Test
	public void testGetPerimeter() {
		assertEquals(square.getPerimeter(), 40, 0.5);
	}
	
	@Test
	public void testGetHeight() {
		assertEquals(square.getHeight(), 10, 0.5);
	}
	
	@Test
	public void testGetWidth() {
		assertEquals(square.getWidth(), 10, 0.5);
	}
	
	@Test
	public void testSetHeight() {
		square.setHeight(4.5);
		assertEquals(square.getHeight(), 4.5, 0.5);
	}
	
	@Test
	public void testSetWidth() {
		square.setWidth(12.1);
		assertEquals(square.getWidth(), 12.1, 0.5);
	}

}
