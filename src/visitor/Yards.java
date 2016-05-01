package visitor;

import java.util.ArrayList;

public class Yards {
	private static ArrayList<_Shape> items;
	
	public static void main(String []args){
		items = new ArrayList<>();
		items.add(new Square(0,0,100,200));
		items.add(new Circle(10,10,200));
		
		System.out.println("The Total turf needed to cover those areas is: ");
		AreaVisitor a = new AreaVisitor();
		for (_Shape item: items){
			item.accept(a);
		}
		System.out.println(a.getTotalArea() + " units squared");

		System.out.println('\n' + "The Total fence needed to surround those areas is: ");
		PerimeterVisitor p = new PerimeterVisitor(); 
		for (_Shape item: items){
			item.accept(p);
		}
		System.out.println(p.getTotalPerimeter() + " units");
	}
}
