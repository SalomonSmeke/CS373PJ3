package visitor;

import java.util.ArrayList;

public class Yards {
	private static ArrayList<_Shape> items;
	
	/*
	 * Our visitor pattern is a set of shapes and visitors to calculate the total area and perimeter of them.
	 * 
	 * The idea here was that new shapes can be added (like triangle) and Visitor will make it easy to implement them
	 * by simply adding their cases to the Visitors.
	 * 
	 * The objects themselves dont change, but the Visitors adopt logic that allow
	 * them to handle the new objects. Solving (like most patterns do) some facet of
	 * decoupling. As well as making code more readable and extensible.
	 */
	
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
