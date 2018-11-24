package chapter2;

public class StaticMethod {

	private int n;
	private static int m;
	
	public void f1() {
		n = 10;
		StaticMethod.m = 20;
	}
	
	public static void f2() {
		//n = 10;
		m = 20;
	}
	
	public void f3() {
		f1();
		f2();
	}
	
	public static void f4() {
		//f1();
		f2();
	}
	
	public static void main(String[] args) {
		
		

	}

}
