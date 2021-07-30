package shapes;
//creating the blueprint of a Circle object
public class Circle {

	//properties	(data members - variables ) (generally declared private-not accessible outside class)
	public double radius;
	private double area;
	private final static double PI=3.14;
	//behaviour		(member functions - methods) (generally declared public-accessible everywhere)
	public void setRadius(double r) {
		radius=r;
	}
	public void computeArea() {
		area = PI * radius * radius;
		System.out.println("Area of Circle : "+area);
	}
	
	
}
