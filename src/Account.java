
public class Account {

	private int ano;
	private String name;
	private int balance;
	private static int totalBalance;					 
	
	public static void show() {
		//System.out.println(balance);
		System.out.println(totalBalance);	//class variable (static)
	}
	
	public void display() {
		System.out.println(balance);		//non-static
		System.out.println(totalBalance);	//static
	}
	
	public void showTotalBalance() {
		System.out.println("Total Balance : "+totalBalance);
	}
	public void setData(int p1, String p2, int p3) {
		ano=p1;
		name=p2;
		balance=p3;
		totalBalance=totalBalance+p3;
	}
	public void showAccountDetails() {
		System.out.println("Account Number : "+ano);
		System.out.println("Customer Name  : "+name);
		System.out.println("Balance   Rs.  : "+balance);
		System.out.println("________________________________________________");
	}
	
}
