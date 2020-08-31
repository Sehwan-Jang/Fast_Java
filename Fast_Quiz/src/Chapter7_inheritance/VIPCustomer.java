package Chapter7_inheritance;

public class VIPCustomer extends Customer {

	double salesRatio;
	private int agentID;

	public VIPCustomer(String customerName, int customerID, int agentID) {
		super(customerName, customerID);
		this.agentID = agentID;

		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}

	@Override
	public int calPrice(int price) {
		bonusPoint += price * bonusRatio;
		return (int) (price * (1 - salesRatio));
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " 담당 상담원 번호는 " + agentID + "번 입니다.";
	}

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

}
