package inheritance;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer("이순신", 10010);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer("김유신",10020);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	}

}
