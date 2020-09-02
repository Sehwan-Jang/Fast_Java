package cooperation;

public class Subway {

	int lineNumber, passengerCount, money;
	
	public Subway(int lineNumber){
		this.lineNumber = lineNumber;		
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println(lineNumber + "호선의 승객은"+passengerCount+" 명이며 수입은"+money+" 입니다.");
	}
}
