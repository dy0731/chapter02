package chapter2;

public class ArrayUtil {

	public static int[] doubleToInt(double[] d) {
		
		int[] temp = new int[d.length];
		for(int i=0 ; i<d.length ; i++) {
			temp[i] = (int)d[i];
		}
		
		return temp;
	}
	
	public static double[] intToDouble(int[] i) {
		
		double[] temp = new double[i.length];
		for(int j=0 ; j<i.length ; j++) {
			temp[j] = (double)i[j];
		}
		
		return temp;
	}
	
	public static int[] concat(int[] i, int[] j) {
		
		int[] k = new int[i.length + j.length];
		
		int index = 0;
		
		for(int n = 0; n < i.length; n++) {
			k[n] = i[n];
			index++;
		}
		
		for(int n = 0; n < j.length; n++) {
			k[index] = j[n];
			index++;
		}
		
		return k;
	}
}
