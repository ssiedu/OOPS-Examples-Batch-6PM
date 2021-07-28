
public class Store {

	public static void main(String[] args) {
		
		Product p1=new Product();
		p1.setCode(111);
		p1.setName("Mouse");
		p1.setPrice(500);
		p1.setTaxRate(10);
		p1.computeNetPrice();
		System.out.println("__________________________________________");
		Product p2=new Product();
		p2.setCode(222);
		p2.setName("KeyBoard");
		p2.setPrice(1000);
		p2.setTaxRate(5);
		p2.computeNetPrice();

	}

}
