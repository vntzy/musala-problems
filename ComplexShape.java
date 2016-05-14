
package shape;

import java.util.ArrayList;

import java.util.List;

public class ComplexShape {

	private List<Shape> shapes = new ArrayList<>();

	public ComplexShape(Rectangle1 r, Circle1 c, Squareeee s) {

		shapes.add(r);
		shapes.add(c);
		shapes.add(s);
	}

	public void setMainShapeChooser() {
		Shape area = shapes.get(0);
		int i;
		for (i = 0; i < shapes.size(); i++) {
			if (shapes.get(i).getArea() > area.getArea()) {
				area = shapes.get(i);

			}

		}
		shapes.remove(area);
		shapes.add(0, area);

	}

	public String useMainColor() {

		return shapes.get(0).getColor();

	}

	public double totalArea() {

		double a = 0;
		for (int i = 0; i < shapes.size(); i++) {

			a += shapes.get(i).getArea();
		}
		return a;

	}
}
