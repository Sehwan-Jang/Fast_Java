package cooperation;

public class TakeTransTest {
 
	public static void main(String[] args) {
		Student studentJ = new Student("Jang", 5000);
		Student studentH = new Student("Han", 10000);
		Student studentE = new Student("Edward", 15000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		Subway subwayGreen = new Subway(2);
		Subway subwayBlue = new Subway(1);
		Taxi taxiKakao = new Taxi("Kakao");
		
		studentH.takeBus(bus100);
		studentJ.takeSubway(subwayGreen);
		studentE.takeTaxi(taxiKakao, 10000, 1);
		
		studentH.showInfo();
		studentJ.showInfo();
		studentE.showInfo();
		
		bus100.showBusInfo();
		bus500.showBusInfo();
		subwayGreen.showSubwayInfo();
	}
}
