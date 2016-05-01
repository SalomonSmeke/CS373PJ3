package visitor;

public class AreaVisitor implements _Visitor{
	private double totalArea;
	
	@Override
	public void visit(Square square) {
		totalArea += square.getHeight() * square.getHeight();
	}

	@Override
	public void visit(Circle circle) {
		totalArea += Math.pow(circle.getRadius(),2)*Math.PI;
	}
	
	public double getTotalArea(){
		return totalArea;
	}

}
