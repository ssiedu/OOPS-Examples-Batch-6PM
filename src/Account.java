
public class Account {

	private int ano;
	private String name;
	private int balance;
	private static int totalBalance;					 
		
	public static void showAvg(Account tmp1, Account tmp2, Account tmp3, Account tmp4) {
		System.out.println("Avg of 4  :" +(tmp1.balance+tmp2.balance+tmp3.balance+tmp4.balance)/4);
	}
	public static void showAvg(Account tmp1, Account tmp2, Account tmp3) {
		System.out.println("Avg of 3  :" +(tmp1.balance+tmp2.balance+tmp3.balance)/3);
	}
	public static void showAvg(Account tmp1, Account tmp2) {
		System.out.println("Avg of 2  :" +(tmp1.balance+tmp2.balance)/2);
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
