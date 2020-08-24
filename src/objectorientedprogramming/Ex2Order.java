package objectorientedprogramming;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex2Order {
	
	Date date;
	long orderNum;
	String orderDate, clientID, clientName, productID, clientAddress;
	
	public Ex2Order(long orderNum, String orderDate, String clientID, 
			String clientName, String productID, String clientAddress) throws ParseException {
		date = new SimpleDateFormat("yyyy-MM-dd").parse(orderDate);
		
		this.orderNum = orderNum;
		this.clientID = clientID;
		this.clientName = clientName;
		this.productID = productID;
		this.clientAddress = clientAddress;
		this.orderDate = orderDate;
	}
	
	public void showOrderInfo( ) {
		System.out.println("주문 번호 : "+ orderNum);
		System.out.println("주문자 아이디 : "+ clientID);
		System.out.println("주문 날짜 : "+ orderDate);
		System.out.println("주문자 이름 : "+ clientName);
		System.out.println("주문 상품 번호 : "+ productID);
		System.out.println("배송 주소 : "+ clientAddress);
	}
}
