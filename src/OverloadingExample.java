

public class OverloadingExample {

	public static void add(int n1, int n2) {
		System.out.println(n1+n2);
	}
	public static void add(int n1, int n2, int n3) {
		System.out.println(n1+n2+n3);
	}
	public static void add(int n1, int n2, int n3, int n4) {
		System.out.println(n1+n2+n3+n4);
	}
	public static void add(int n1, int n2, int n3, int n4, int n5) {
		System.out.println(n1+n2+n3+n4+n5);
	}
	
	public static void main(String[] args) {
		add(10,20);
		add(10,20,30);
		add(10,20,30,40);
		add(10,20,30,40,50);
		
		

	}

}
