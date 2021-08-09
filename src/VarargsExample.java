
public class VarargsExample {

	public static void add(int x, int y) {
		System.out.println("SUM : "+(x+y));
	}
	public static void add(String...v) {
		String s="";
		for(int i=0; i<v.length; i++) {
			s=s+v[i];
		}
		System.out.println(s);
	}
	public static void add(int...v) {	
		int sum=0;
		
		for(int num:v) {
			sum=sum+num;
		}
		
		/*
		for(int i=0; i<v.length; i++) {
			sum=sum+v[i];
		}
		*/
		
		System.out.println(sum);
		
	}
		
	public static void main(String[] args) {
		add(10,20);
		add(10,20,30);
		add(10,20,30,40);
		add("aa","bb");
		add("xx","yy","zz");
		
	
	}


	

}
