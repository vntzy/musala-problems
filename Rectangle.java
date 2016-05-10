package rectangle;


public class Rectangle {
private double height;
private double width;
private String color; 
public Rectangle(double wid, double high){
height = high;
width = wid;
} 
public Rectangle(){
height = 1;
width = 1;
color = "White";
} 
public void setHeight(double high){
height = high;
}
public void setWidth(double wid){
width = wid;
}
public void setColor(String col){
color = col;
} 
public double getArea(){
return height*width;
}
public double getPerimeter(){
return 2*(height + width);
}
public void getColor(){
System.out.println("Color is: " + color +"\n");
}

public static void main(String[] args){
Rectangle rectangle1 = new Rectangle();
Rectangle rectangle2 = new Rectangle(4, 40);
Rectangle rectangle3 = new Rectangle(3.5, 35.9);


rectangle2.setColor("red");
rectangle3.setColor("blue");
rectangle1.getColor();
rectangle2.getColor();
rectangle3.getColor();
System.out.println("The perimeter of the first rectangle is: " + rectangle1.getPerimeter() + "\n");
System.out.println("The perimeter of the second rectangle is: " + rectangle2.getPerimeter() + "\n");
System.out.println("The perimeter of the third rectangle is: " + rectangle3.getPerimeter() + "\n");
System.out.println("The area of the first rectangle is: " + rectangle1.getArea() + "\n");
System.out.println("The area of the second rectangle is: " + rectangle2.getArea() + "\n");
System.out.println("The area of the third rectangle is: " + rectangle3.getArea() + "\n");
}
}


