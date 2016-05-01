package visitor;

public class Circle implements _Shape{
	private double x,y,radius;
	
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
