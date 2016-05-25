package shape;

import java.util.List;

public abstract class Shape implements Setmain {

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

	@Override
	public Shape letmain(List<Shape> s) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {

		Squareeee s = new Squareeee(5);
		Rectangle1 r = new Rectangle1(2, 3);
		Circle1 c = new Circle1(2);

		s.setColor("blue");
		s.setName("Square");
		System.out.println("The Square has\n Area: " + s.getArea() + " \n Perimetar:" + s.getPerimeter()
				+ "\n and Color: " + s.getColor() + "\n The shape is " + s.getName());
		System.out.println(" ");

		r.setColor("red");
		r.setName("Rectangle");
		System.out.println("The Rectangle has\n Area: " + r.getArea() + " \n Perimetar:" + r.getPerimeter()
				+ "\n and Color: " + r.getColor() + "\n The shape is " + r.getName());

		System.out.println(" ");

		c.setColor("green");
		c.setName("Circle");
		System.out.println("The Circle has\n Area: " + c.getArea() + " \n Perimetar:" + c.getPerimeter()
				+ "\n and Color: " + c.getColor() + "\n The shape is " + c.getName());

		System.out.println(" ");

		ComplexShape complex = new ComplexShape(c, s, r);

		complex.SetMainStrategy(new BigestArea());

		complex.useMainColor();
complex.prva(c, s, r);
		complex.complex1();
		System.out.println("The area of the COMLPEX SHAPE is " + complex.totalArea());
		System.out.println(complex.printshape());
	}
}
