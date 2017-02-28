/*
 * Author: Tan Trieu
 * Last Modified: 2/28/17
 */

package shapes.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import shapes.main.Triangle;

public class TriangleTest {
	
	private Triangle triangle;

	@Before
	public void setUp() {
		triangle = new Triangle(4.0, 5.0, 6.0);
	}
	
	// tests the area of a triangle assuming that the sides are 4.0, 5.0 and 6.0 respectively
	@Test
	public void testGetArea() {
		assertEquals(triangle.getArea(), 9.92, 0.5);
	}
	
	
	// tests the perimeter of a triangle assuming that the sides are 4.0, 5.0 and 6.0 respectively
	@Test
	public void testgetPerimeter() {
		assertEquals(triangle.getPerimeter(), 7.5, 0.5);
	}
	
	@Test
	public void testSetSide1() {
		triangle.setSide1(7.0);
		assertEquals(triangle.getSide1(), 7.0, 0);
	}
	
	@Test
	public void testSetSide2() {
		triangle.setSide2(11.0);
		assertEquals(triangle.getSide2(), 11.0, 0);
	}
	
	@Test
	public void testSetSide3() {
		triangle.setSide3(9.0);
		assertEquals(triangle.getSide3(), 9.0, 0);
	}
	
	@Test
	public void testGetSide1() {
		assertEquals(triangle.getSide1(), 4.0, 0);
	}
	
	@Test
	public void testGetSide2() {
		assertEquals(triangle.getSide2(), 5.0, 0);
	}
	
	@Test
	public void testGetSide3() {
		assertEquals(triangle.getSide3(), 6.0, 0);
	}
}
