package circle;

  public class Circle {  // Save as "Circle.java"
		   // private instance variable, not accessible from outside this class
		   private double radius;
		   private String color;
		   
		   // The default constructor with no argument.
		   // It sets the radius and color to their default value.
		   public Circle() {
		      radius = 1.0;
		      color = "red";
		   }
		   
		   // 2nd constructor with given radius, but color default
		   public Circle(double r, String col) {
		      radius = r;
		      color = col;
		   }
		   
		   // A public method for retrieving the radius
		   public double getRadius() {
		     return radius; 
		   }
		   
		   public String getColor(){
			   
			   return color;
		   }
		   
		   // A public method for computing the area of circle
		   public double getArea() {
		      return radius*radius*Math.PI;
		   }
	
  
		   public static void main(String[] args) {
			      // Declare an instance of Circle class called c1.
			      // Construct the instance c1 by invoking the "default" constructor
			      // which sets its radius and color to their default value.
			      Circle c1 = new Circle();
			      // Invoke public methods on instance c1, via dot operator.
			      System.out.println("The circle has radius of " 
			         + c1.getRadius() + " and area of " + c1.getArea()+"and color "+c1.getColor());
			   
			      // Declare an instance of class circle called c2.
			      // Construct the instance c2 by invoking the second constructor
			      // with the given radius and default color.
			      Circle c2 = new Circle(2.0, "blue");
			      // Invoke public methods on instance c2, via dot operator.
			      System.out.println("The circle has radius of " 
			         + c2.getRadius() + " and area of " + c2.getArea()+" an color "+ c2.getColor());
		   }
  
  
  }
  
  
  