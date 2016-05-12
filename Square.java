package shape;

public class Squareeee extends Shape {

	public double height;

	public Squareeee(double height) {
		this.height = height;

	}

	public Squareeee() {
		height = 1;
	}

	public double getPerimeter() {
		return 4 * height;

	}

	public double getArea() {
		return height * height;

	}
}
