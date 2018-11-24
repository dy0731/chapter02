package chapter2;

public class ArrayUtilTest {

	public static void main(String[] args) {
		
		double[] d = {10.1, 11.2, 12.3, 13.4};
		int[] i = ArrayUtil.doubleToInt(d);
		for(int a : i) {
			System.out.println(a);
		}
		
		System.out.println("");
		
		int[] i2 = {10, 11, 23, 34, 12};
		double[] d2 = ArrayUtil.intToDouble(i2);
		for(double b : d2) {
			System.out.println(b);
		}

		System.out.println("");
		
		int[] i3 = ArrayUtil.concat(i, i2);
		for(int c : i3) {
			System.out.println(c);
		}
	}

}
