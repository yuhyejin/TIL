package ch15;

public class Taxi {

	String taxiName;
	int money;
	
	public Taxi(String taxiName) {
		this.taxiName = taxiName;
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println(taxiName +  "수입은" + money + "원 입니다." );
	}
}
