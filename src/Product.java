
public class Product {
	//data members
	private int code;
	private String name;
	private int price;
	private int taxRate;
	private int taxAmount;
	private int netPrice;
	
	//methods
	public void computeNetPrice() {
		taxAmount=price*taxRate/100;	
		netPrice=price+taxAmount;
		System.out.println("Code       : "+ code);
		System.out.println("Name       : "+ name);
		System.out.println("Price      : "+ price);
		System.out.println("Tax Rate   : "+ taxRate + " % ");
		System.out.println("Tax Amount : "+ taxAmount);
		System.out.println("Net Price  : "+ netPrice);
		
	}

	public void setCode(int c) {
		code=c;
	}
	public void setName(String n) {
		name=n;
	}
	public void setPrice(int p) {
		price=p;
	}
	public void setTaxRate(int t) {
		taxRate=t;
	}
}
