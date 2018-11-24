package chapter2;

public class CustomerApp {

	public static void main(String[] args) {
		
		Customer c = new Customer();
		c.setAge(10);
		c.setName("홍길동");
		//private 는 외부에서 접근 불가
		//c.name = "aa";
		
		System.out.println(c.getName());
		System.out.println(c.getAge());

	}

}
