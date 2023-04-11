package ch08;

public class Order {
	
	long orderID;
	String phoneNum;
	String orderAdress;
	int orderDate;
	int orderTime;
	int orderPrice;
	String menuNum;
	
	public Order() {}
	
	public Order(long orderID, String phoneNum, String orderAdress, int orderDate, int orderTime, int orderPrice, String menuNum) {
		this.orderID = orderID;
		this.phoneNum = phoneNum;
		this.orderAdress = orderAdress;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.orderPrice = orderPrice;
		this.menuNum = menuNum;
	}
	
	public void showOrderInfo() {
		System.out.println("주문 접수 번호 : " + orderID);
		System.out.println("주문 핸드폰 번호 : " + phoneNum);
		System.out.println("주문 집 주소 : " + orderAdress);
		System.out.println("주문 날짜 : " + orderDate);
		System.out.println("주문 시간 : " + orderTime);
		System.out.println("주문 가격 : " + orderPrice);
		System.out.println("메뉴 번호 : " + menuNum);
	}
	
	

}
