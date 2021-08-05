
public class Account {

	private int ano;
	private String name;
	private int balance;
	private static int totalBalance;					 
	
	public static int add(int number1, int number2) {
		return number1+number2;
	}
	
	public static void info() {
		System.out.println("Its A Banking Application...!");
		System.out.println("Developed For Managing Accounts....!");
		System.out.println("________________________________________________________");
	}
	//suppose we wish to compute the avg-balance of any two accounts.
	
	public static void showAvg(Account tmp1, Account tmp2) {
		System.out.println("Avg of 2  :" +add(tmp1.balance,tmp2.balance)/2);
	}
	
	
	
	
	//non-static-version
	public void showAccountDetails() {
		System.out.println("Account Number : "+ano);
		System.out.println("Customer Name  : "+name);
		System.out.println("Balance   Rs.  : "+balance);
		System.out.println("________________________________________________");
	}
	/*
	//static-version
	public static void showAccountDetails(Account tmp) {
		System.out.println("Account Number : "+tmp.ano);
		System.out.println("Customer Name  : "+tmp.name);
		System.out.println("Balance   Rs.  : "+tmp.balance);
		System.out.println("________________________________________________");
	}
	*/
	public static void showTotalBalance() {
		System.out.println("Total Balance : "+totalBalance);
	}
	public void setData(int p1, String p2, int p3) {
		ano=p1;
		name=p2;
		balance=p3;
		totalBalance=totalBalance+p3;
	}
	
	
}
