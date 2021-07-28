package shapes;
//creating the blueprint of a Circle object
public class Circle {

	//properties	(data members - variables ) (generally declared private-not accessible outside class)
	public double radius;
	private double area;
	
	//behaviour		(member functions - methods) (generally declared public-accessible everywhere)
	public void setRadius(double r) {
		radius=r;
	}
	public void computeArea() {
		area = 3.14 * radius * radius;
		System.out.println("Area of Circle : "+area);
	}
	
	
}
