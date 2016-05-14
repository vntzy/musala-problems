package shape;

public abstract class Shape {

	public abstract double getArea();

	public abstract double getPerimeter();

	 private String color;

	public void setColor(String col) {
		color = col;

	}

	public String getColor() {

		return color;
	}

	private String name;

	public void setName(String nam) {
		name = nam;

	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {

		Squareeee s = new Squareeee(5);
		Rectangle1 r = new Rectangle1(2, 3);
		Circle1 c = new Circle1();

		// Shape figureshape;
		// figureshape = s;
		s.setColor("blue");
		s.setName("Square");
		System.out.println("The Square has\n Area: " + s.getArea() + " \n Perimetar:" + s.getPerimeter()
				+ "\n and Color: " + s.getColor() + "\n The shape is " + s.getName());
		System.out.println(" ");

		// figureshape = r;
		r.setColor("red");
		r.setName("Rectangle");
		System.out.println("The Rectangle has\n Area: " + r.getArea() + " \n Perimetar:" + r.getPerimeter()
				+ "\n and Color: " + r.getColor() + "\n The shape is " + r.getName());
		
		System.out.println(" ");

		// figureshape = c;
		c.setColor("green");
		c.setName("Circle");
		System.out.println("The Circle has\n Area: " + c.getArea() + " \n Perimetar:" + c.getPerimeter()
				+ "\n and Color: " + c.getColor() + "\n The shape is " + c.getName());
				
				
					System.out.println(" ");

		ComplexShape complex = new ComplexShape(r, c, s);

		complex.setMainShapeChooser(); // make the shape with biggest area as
										// first in the list

		String maincolor = complex.useMainColor();/// as main color takes the
													/// color of the first shape
													/// in the list

		r.setColor(maincolor);
		s.setColor(maincolor);
		c.setColor(maincolor);

		System.out.println("The COMPLEX SHAPE is consisteod of:\n " + r.getName() + " with color " + r.getColor() + "\n"
				+ c.getName() + " with color " + c.getColor() + "\n and " + s.getName() + " with color "
				+ c.getColor());
		System.out.println("The area of the COMLPEX SHAPE is " + complex.totalArea());

	

	}
}
