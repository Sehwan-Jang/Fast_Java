package objectorientedprogramming;

public class Ex3MyDateTest {
	
	public static void main(String[] args) {
		
		Ex3MyDate date = new Ex3MyDate(29, 2, 2300);
		
		date.setYear(2400);
		date.showDate();
		date.setMonth(13);
		date.showDate();
	}

}
