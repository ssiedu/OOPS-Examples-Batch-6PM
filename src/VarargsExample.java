
public class VarargsExample {

	public static void add(int...v) {
		
	}
	public static void show(String...v) {
		
	}
	
	public static void main(String[] args) {
		
		add();
		add(10,20);
		add(10,20,30);
		add(10,20,30,40);
		add(1,2,3,4,5,6,7,8,9,10);
		show("indore");
		show("indore","delhi");
		show("indore","delhi","mumbai");
	}


	

}
