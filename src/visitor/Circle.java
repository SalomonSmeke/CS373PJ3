package visitor;

public class Circle implements _Shape{
	private double x,y,radius;
	
	public Circle(double x, double y, double radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void accept(_Visitor visitor){
		visitor.visit(this);
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public double getRadius(){
		return radius;
	}
}
