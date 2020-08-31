package Chapter7_inheritance;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<Customer>();

		Customer cusV1 = new VIPCustomer("Jang", 10001, 01);
		Customer cusG1 = new GoldCustomer("Kim", 10002);
		Customer cusG2 = new GoldCustomer("Choi", 10003);
		Customer cusS1 = new Customer("Jeon", 10004);
		Customer cusS2 = new Customer("Jaegal", 10005);

		customerList.add(cusV1);
		customerList.add(cusG1);
		customerList.add(cusG2);
		customerList.add(cusS1);
		customerList.add(cusS2);

		for (Customer customer : customerList) {
			System.out
					.println(10000 + "원 결제시 실결제액은 " + customer.calPrice(10000) + "원 이고 " + customer.showCustomerInfo());
		}

	}

}
