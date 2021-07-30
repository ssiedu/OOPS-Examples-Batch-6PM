
public class TV {
	
	private int freq;
	
	public void remote(int button) {
		switch(button) {
		case 1:
			freq=100;
			System.out.println("Zee TV");
		break;
		case 2:
			freq=200;
			System.out.println("Star TV");
		break;
		case 3:
			freq=300;
			System.out.println("Cartoon Network");
		break;
		}
	}
}
