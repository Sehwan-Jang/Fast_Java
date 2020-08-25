package cooperation;

public class Taxi {

	String taxiName;
	int money, passengerCount;
	
	public Taxi(String taxiName) {
		this.taxiName = taxiName;
	}
	
	public void take(int money, int passengerNum) {
		this.money += money;
		this.passengerCount += passengerNum;
	}
	
	public void showTaxiInfo() {
		System.out.println(taxiName + "택시의 승객은"+passengerCount+" 명이며 수입은"+money+" 입니다.");
	}
}
