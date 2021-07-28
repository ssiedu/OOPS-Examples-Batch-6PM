import shapes.Circle;

public class CircleUser {

	public static void main(String[] args) {
		//here we need to compute the area of circle with radius 10
		
		Circle c1=new Circle();
		c1.setRadius(10);
		c1.computeArea();

		Circle c2=new Circle();
		c2.setRadius(20);
		c2.computeArea();
		
		Circle c3=new Circle();
		c3.setRadius(30);
		c3.computeArea();
	}

}
