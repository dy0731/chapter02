package paint;

public class MainApp {

	public static void main(String[] args) {
		
		Point pt1 = new Point();
		pt1.setX(10);
		pt1.setY(20);
		pt1.show();
		
		Point pt2 = new Point(100, 200);
		pt2.show();
		pt2.show(false);

	}

}



