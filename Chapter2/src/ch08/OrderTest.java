package ch08;

public class OrderTest {

	public static void main(String[] args) {

		Order order = new Order(202011020003L, "01023450001", "서울시 강남구 역삼동 111-333", 20201102, 130258, 35000, "0003");
		
		order.showOrderInfo();
		
	}

}
