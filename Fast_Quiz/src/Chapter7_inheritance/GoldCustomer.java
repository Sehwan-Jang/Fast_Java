package Chapter7_inheritance;

public class GoldCustomer extends Customer {

	double salesRatio;

	public GoldCustomer(String customerName, int customerID) {
		super(customerName, customerID);

		customerGrade = "GOLD";
		bonusRatio = 0.02;
		salesRatio = 0.1;
	}

	public int calPrice(int price) {
		bonusPoint += price * bonusRatio;
		return (int) (price * (1 - salesRatio));
	}
}
