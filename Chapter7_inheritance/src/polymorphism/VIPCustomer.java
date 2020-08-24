package polymorphism;

public class VIPCustomer extends Customer {

	double salesRatio;
	private int agentID;
	
	public VIPCustomer(String customerName, int customerID) {
		super(customerName, customerID);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	@Override
	public int calPrice(int price) {
		bonusPoint += price*bonusRatio;
		return (int)(price*(1-salesRatio));
	}

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
	
}
