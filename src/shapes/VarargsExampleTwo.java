package shapes;

public class VarargsExampleTwo {
	
	public static void display(String... items) {
		for(int i=0; i<items.length; i++) {
			System.out.println(items[i]);
		}
	}
	
	
	public static void main(String... args) {
		//display("indore");						//{"indore"}
		//display("indore","bhopal");				//{"indore","bhopal"}
		display("indore","bhopal","chennai");	//{"indore","bhopal","chennai"}
	}
}
