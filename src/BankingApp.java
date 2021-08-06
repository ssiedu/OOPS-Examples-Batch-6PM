
public class BankingApp {

	public static void main(String[] args) {
		
		
		Account ac1=new Account();
		Account ac2=new Account();
		Account ac3=new Account();
		Account ac4=new Account();
		
		ac1.setData(111, "AAA", 10000);
		ac2.setData(112, "BBB", 20000);
		ac3.setData(113, "CCC", 30000);
		ac4.setData(114, "DDD", 40000);
		//Account.showAccountDetails(ac1);
		//Account.showAccountDetails(ac2);
		//Account.showAccountDetails(ac3);
		
		ac1.showAccountDetails();
		ac2.showAccountDetails();
		ac3.showAccountDetails();
		ac4.showAccountDetails();
		
		Account.showAvg(ac1, ac2);
		Account.showAvg(ac1, ac2, ac3);
		Account.showAvg(ac1, ac2, ac3, ac4);
		
		//ac1.showAvg(ac2);
		//ac2.showAvg(ac3);
		//ac1.showAvg(ac3);
		
		//Account.showTotalBalance();
		
	}

}
