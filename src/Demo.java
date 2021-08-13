
public class Demo {

	
	public Demo() {		//constructor (during object creation)
		System.out.println("Object Created ....");
	}
	
	public void finalize() { 	//before garbage collection
		System.out.println("Object Is About To Be Destroyed  @@@@@@@@@@@@@@@@@@@@@==================>");
	}

	public static void main(String args[]) {
		while(true) {
			new Demo();
		}
	}


}
