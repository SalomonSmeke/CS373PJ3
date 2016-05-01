package visitor;

public class Square implements _Shape{
	private double x,y,width,height;
	
	public void accept(_Visitor visitor){
		visitor.visit(this);
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public double getWidth(){
		return width;
	}
	
	public double getHeight(){
		return height;
	}
}
