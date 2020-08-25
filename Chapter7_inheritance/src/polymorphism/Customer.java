package polymorphism;

public class Customer {

	protected String  customerName, customerGrade;
	protected int customerID;
	double  bonusRatio;
	int bonusPoint;
		
	public Customer(String customerName, int customerID) {
		this.customerName = customerName;
		this.customerID = customerID;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price;
	}
	
	public String showCustomerInfo( ) {
		return customerName + "님의 등급은 "+ customerGrade+ " 이며 보너스 "
				+ "포인트는 " + bonusPoint+"점 입니다.";
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	
}
