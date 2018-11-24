package chapter2;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods goods = new Goods();
		goods.setName("nikon");
		goods.setPrice(2000);
		goods.setCountStock(30);
		goods.setCountSold(20);
		
		goods.showInfo();
		
		System.out.println(goods.calcDiscountPrice(0.4f));
		
		Goods goods1 = new Goods();
		Goods goods2 = new Goods();
		System.out.println("goods counts : " + Goods.countOfGoods);
	}

}
