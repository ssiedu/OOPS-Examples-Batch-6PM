
public class Emp {
	private int eno;
	private String name;
	private int sal;

	public void m1() {
		
	}
	public Emp() {
		m1();
	}
	public Emp(int p, String q) {
		this();
		eno=p;
		name=q;
	}
	public Emp(int a, String b, int c) {
		this(a,b);	//2 arg constructor call
		sal=c;
	}
	
	public void info() {
		System.out.println("Emp Code : "+eno);
		System.out.println("Emp Name : "+name);
		System.out.println("Salary   : "+sal);
		System.out.println("_______________________________________________");
	}
	
	public static void main(String[] args) {
		Emp e=new Emp(111,"AAA",10000);
		e.info();
	}

}
