package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		customer.buy();
		customer.order();
		customer.sayhello();
		
		Buy bCustomer = customer;
		
		bCustomer.order();
	}

}
