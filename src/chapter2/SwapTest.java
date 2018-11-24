package chapter2;

public class SwapTest {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println(a + ":" + b);
		
		swap(a,b);

		System.out.println(a + ":" + b);
		
		
		Value m = new Value();
		m.val = 10;
		
		Value n = new Value();
		n.val = 20;
		
		System.out.println(m.val + ":" + n.val);
		swap2(m,n);
		System.out.println(m.val + ":" + n.val);

	}
	
	public static void swap(int i, int j) {
		int temp = i;
		i = j;
		j = temp;
	}
	
	public static void swap2(Value i, Value j) {
		int temp = i.val;
		i.val = j.val;
		j.val = temp;
	}
}
