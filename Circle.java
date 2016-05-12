package shape;

public class Circle1 extends Shape {
	// private instance variable, not accessible from outside this class
	private double radius;

	// The default constructor with no argument.
	// It sets the radius to default value.
	public Circle1() {
		radius = 1.0;

	}

	// 2nd constructor with given radius
	public Circle1(double r) {
		radius = r;

	}

	// A public method for computing the area of circle
	public double getArea() {
		return radius * radius * Math.PI;
	}

	public double getPerimeter() {
		return 2 * radius * Math.PI;

	}
}
