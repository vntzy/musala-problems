
package shape;

import java.util.ArrayList;
import java.util.List;

public class ComplexShape {
	Setmain strategy;
	
	List<Shape> shapes = new ArrayList<>();
	public ComplexShape(Shape... shapes) {
		this.shapes.add(shapes[0]);
		this.shapes.add(shapes[1]);
		this.shapes.add(shapes[2]);
	}

	public void SetMainStrategy(Setmain strategy) {

		this.strategy = strategy;
	}

	public double totalArea() {

		double a = 0;
		for (int i = 0; i < shapes.size(); i++) {

			a += shapes.get(i).getArea();
		}
		return a;

	}

	public void complex1() {

		System.out.println("The COMPLEX SHAPE is consisteod of:\n " + shapes.get(0).getName() + " with color "
				+ shapes.get(0).getColor() + "\n" + shapes.get(1).getName() + " with color " + shapes.get(1).getColor()
				+ "\n and " + shapes.get(2).getName() + " with color " + shapes.get(2).getColor());

	}

	public List<Shape> printshape() {

		return shapes;
	}

	public void prva(Shape r, Shape c, Shape s) {
		shapes.clear();
		shapes.add(r);
		shapes.add(c);
		shapes.add(s);

	}

	void useMainColor(){
		Shape main = strategy.letmain(shapes);
		
		for(Shape shape : shapes){
			
		shape.setColor(main.getColor());
		}
		
		}
		
		
		
	}

class LastElement implements Setmain {

	

	@Override
	public Shape letmain(List<Shape> s) {
		// TODO Auto-generated method stub
		return s.get(s.size() - 1);
	}

}

class FirstElement implements Setmain {

	

	@Override
	public Shape letmain(List<Shape> s) {
		// TODO Auto-generated method stub
		return s.get(0);
	}

}

class BigestArea implements Setmain {

	public Shape letmain(List<Shape> s)  {
		Shape a;
		a = s.get(0);
		int i;
		for (i = 1; i < s.size(); i++) {
			if (s.get(i).getArea() > a.getArea()) {
				a = s.get(i);

			}

		}
		s.remove(a);
		s.add(0, a);
		return a;
	}

}
