
package square;


public class Square{
	
	private double height;
	private String color;
	
	public Square(double height){
		this.height = height;
		}
	
	public Square (){
		height=1;
		color="white";
		}
	
	
	public void setColor(String col){
		
		color=col;
	}
	
	public double getPerimetar(){
		return 4*height;
		
	}

	public double getArea(){
		return height*height;
		
	}
	public String getColor(){
		
		return(color);
	}
	
	
	public static void main (String[] args){
		Square square1= new Square();
		Square square2 = new Square(3.0);
		Square square3 = new Square (5.2);
		
		square2.setColor("blue");
		square3.setColor("red");
		
		System.out.println("First square has \n perimetar : "+ square1.getPerimetar()+"\n Area : "+square1.getArea() +"\n Color "+square1.getColor());
		System.out.println(" ");
		System.out.println("Second square  has \n Perimetar : "+ square2.getPerimetar()+" \n Area "+ square2.getArea()+"\n Color "+ square2.getColor());
		System.out.println(" ");

		System.out.println("Third square  has \n Perimetar : "+ square3.getPerimetar()+"\n Area "+ square3.getArea()+"\n Color " + square3.getColor());

	}
}
