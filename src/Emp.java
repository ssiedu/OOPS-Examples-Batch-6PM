
public class Emp {
	private int eno;
	private String name;
	private int sal;
	
	public Emp(int a, String b, int c) {
		eno=a; name=b; sal=c;
	}
	public void setData(int a, String b, int c) {
		eno=a; name=b; sal=c;
	}
	public void info() {
		System.out.println("Emp Code : "+eno);
		System.out.println("Emp Name : "+name);
		System.out.println("Salary   : "+sal);
		System.out.println("_______________________________________________");
	}
	
	public static void main(String[] args) {
		Emp e1=new Emp(111,"AAA",10000);
		Emp e2=new Emp(112,"BBB",20000);
		//e1.setData(111, "AAA", 10000);
		//e2.setData(112, "BBB", 20000);
		e1.info();
		e2.info();
	}

}
