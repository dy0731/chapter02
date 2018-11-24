package chapter2;

public class Goods {
	
	private String name;
	private int price;
	private int countStock;
	private int countSold;

	public static int countOfGoods;
	
	public Goods() {
		//static 변수는 클래스 이름으로 접근
		//Goods.countOfGoods++;
		countOfGoods++;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	
	public void showInfo() {
		System.out.println("상품이름 : " + name);
		System.out.println("상품가격 : " + price);
		System.out.println("상품재고량 : " + countStock);
		System.out.println("상품판매량 : " + countSold);
	}
	
	public int calcDiscountPrice(float rate) {
		return price - (int)(price * rate);
	}
}
