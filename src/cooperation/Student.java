package cooperation;

public class Student {
	String studentName;
	int grade, money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -=1000;
	}

	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -=1200;
	}
	
	public void takeTaxi(Taxi taxi, int money, int passengerNum) {
		taxi.take(money, passengerNum);
		this.money -= money;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은"+ money+" 입니다.");
	}
}
