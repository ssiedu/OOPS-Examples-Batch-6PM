
public class Account {

	private int ano;
	private String name;
	private int balance;
	private static int totalBalance;					 
	
	//non-static-version
	public void showAccountDetails() {
		System.out.println("Account Number : "+ano);
		System.out.println("Customer Name  : "+name);
		System.out.println("Balance   Rs.  : "+balance);
		System.out.println("________________________________________________");
	}
	
	//static-version
	public static void showAccountDetails(Account tmp) {
		System.out.println("Account Number : "+tmp.ano);
		System.out.println("Customer Name  : "+tmp.name);
		System.out.println("Balance   Rs.  : "+tmp.balance);
		System.out.println("________________________________________________");
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
	
	
}
