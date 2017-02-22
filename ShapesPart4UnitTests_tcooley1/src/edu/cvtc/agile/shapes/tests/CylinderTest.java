package edu.cvtc.agile.shapes.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.cvtc.agile.shapes.Cuboid;
import edu.cvtc.agile.shapes.Cylinder;
import edu.cvtc.agile.shapes.Dialog;
import edu.cvtc.agile.shapes.MessageBox;
import edu.cvtc.agile.tests.substitutes.MessageBoxSubstitute;

public class CylinderTest {

	@Test
	public void testSurfaceArea1() {
		Cylinder cylinder = new Cylinder(10, 10, null);
		
		float expected = (float) (2 * Math.PI * 10 * 10 + (2 * Math.PI * Math.pow(10, 2)));
		
		float actual = cylinder.surfaceArea();
		
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testSurfaceArea2() {
		Cylinder cylinder = new Cylinder(50, 75, null);
		
		float expected = (float) (2 * Math.PI * 50 * 75 + (2 * Math.PI * Math.pow(50, 2)));
		
		float actual = cylinder.surfaceArea();
		
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testSurfaceArea3() {
		Cylinder cylinder = new Cylinder(9.567f, 2.456f, null);
		
		float expected = (float) (2 * Math.PI * 9.567f * 2.456f + (2 * Math.PI * Math.pow(9.567f, 2)));
		
		float actual = cylinder.surfaceArea();
		
		assertEquals(expected, actual, 0);
	}

	@Test
	public void testVolume1() {
		Cylinder cylinder = new Cylinder(50, 75, null);
		
		float expected = (float)(Math.PI * Math.pow(50, 2) * 75);
		
		float actual = cylinder.volume();
		
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testVolume2() {
		Cylinder cylinder = new Cylinder(25, 99.50f, null);
		
		float expected = (float)(Math.PI * Math.pow(25, 2) * 99.50f);
		
		float actual = cylinder.volume();
		
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testVolume3() {
		Cylinder cylinder = new Cylinder(4.275f, 15.600f, null);
		
		float expected = (float)(Math.PI * Math.pow(4.275f, 2) * 15.600f);
		
		float actual = cylinder.volume();
		
		assertEquals(expected, actual, 0);
	}

	@Test
	public void testCylinder1() {
		float expectedRadius = 575.25f;
		
		Cylinder cylinder = new Cylinder(575.25f, 1, null);
		
		assertEquals(expectedRadius, cylinder.getRadius(), 0);
	}
	
	@Test
	public void testCylinde2() {
		float unexpected = -575.25f;
		
		Cylinder cylinder = new Cylinder(-575.25f, 1, null);
		
		assertNotEquals("Please make sure to enter valid values!", unexpected, cylinder.getRadius());
	}

	@Test
	public void testGetRadius() {
		Cylinder cylinder = new Cylinder(575.25f, 1, null);
		
		float expected = 575.25f;
		
		float actual = cylinder.getRadius();
		
		assertEquals(expected, actual, 0);
	}

	@Test
	public void testGetHeight() {
		Cylinder cylinder = new Cylinder(1, 575.25f, null);
		
		float expected = 575.25f;
		
		float actual = cylinder.getHeight();
		
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testRender() {
		Dialog dialog = new MessageBox();
		
		MessageBoxSubstitute dialogSubstitute = new MessageBoxSubstitute();
		
		Cylinder cylinder = new Cylinder(dialogSubstitute);
		
		cylinder.render();
	}
}
