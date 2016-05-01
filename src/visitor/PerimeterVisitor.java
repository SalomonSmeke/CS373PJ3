package visitor;

public class PerimeterVisitor implements _Visitor{
	public double totalPerimeter;
	
	@Override
	public void visit(Square square) {
		totalPerimeter = square.getHeight()*2d + square.getWidth()*2d;
	}

	@Override
	public void visit(Circle circle) {
		totalPerimeter = 2d*Math.PI*circle.getRadius();
	}
	
	public double getTotalPerimeter(){
		return totalPerimeter;
	}

}
