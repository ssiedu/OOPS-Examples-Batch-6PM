
public class Demo {

	private int x, y;			//instance variables	(one separate copy for each object)
	private static int p, q;	//class variables		(only one copy for whole class)
	public static void main(String[] args) {
		
		//instantiating class Demo thrice (three instances will be created)
		
		Demo d1=new Demo();			//this instance will have its own copy of x and y
		Demo d2=new Demo();			//this instance will have its own copy of x and y
		Demo d3=new Demo();			//this instance will also have its own copy of x and y.
		
		d1.x=10;					//storing 10 to x of d1					
		d2.x=20;					//storing 20 to x of d2
		d3.x=30;					//storing 30 to x of d3
		
		System.out.println(d1.x);
		System.out.println(d2.x);
		System.out.println(d3.x);
		d1.p=100;				//storing 100 to the class variable p
		d2.p=200;				//storing 200 to the class variable p and it will overwrite prev value 100
		d3.p=300;				//storing 300 to the class variable p and it will overwrite prev value 200.
		
		System.out.println(d1.p);
		System.out.println(d2.p);
		System.out.println(d3.p);
		

	}

}
