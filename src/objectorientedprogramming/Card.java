package objectorientedprogramming;

public class Card {
	private static int SERIAL_NUM = 10000;
	private int cardNumber;

	Card() {
		SERIAL_NUM++;
		cardNumber = SERIAL_NUM;
	}	
		
	public int getCardNumber() {
		return cardNumber;
	}
	
	public int getSerialNumber() {
		return SERIAL_NUM;
	}
}
