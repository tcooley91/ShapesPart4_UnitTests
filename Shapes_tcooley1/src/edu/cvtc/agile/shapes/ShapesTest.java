/**
 * 
 */
package edu.cvtc.agile.shapes;

/**
 * @author Tyler
 *
 */
public class ShapesTest {
	public static void main(String[] args) {
		// Test values to make sure the formula methods work for each class
		final float TEST_RADIUS = 5.0f;
		final float TEST_HEIGHT = 10.0f;
		final float TEST_DEPTH = 8.5f;
		final float TEST_WIDTH = 4.5f;
		
		Dialog dialog = new MessageBox();
		
		
		// New instances of the Cylinder, Sphere, and Cuboid classes with the Test values inputed in
		Cylinder cylinder = new Cylinder(TEST_RADIUS, TEST_HEIGHT, dialog);
		Sphere sphere = new Sphere(TEST_RADIUS, dialog);
		Cuboid cuboid = new Cuboid(TEST_WIDTH, TEST_HEIGHT, TEST_DEPTH, dialog);
		
		// Instance calls to the render methods of each class
		cuboid.render();
		cylinder.render();
		sphere.render();
	}
}
