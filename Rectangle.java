package shape;

public class Rectangle1 extends Shape {
	private double height;
	private double width;

	public Rectangle1(double wid, double high) {
		height = high;
		width = wid;
	}

	public Rectangle1() {
		height = 1;
		width = 1;

	}

	public double getArea() {
		return height * width;
	}

	public double getPerimeter() {
		return 2 * (height + width);
	}

}
