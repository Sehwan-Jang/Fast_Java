package objectorientedprogramming;

import java.text.ParseException;

public class Ex2OrderTest {

	public static void main(String[] args) throws ParseException {
		
		Ex2Order order = new Ex2Order(202008190001L, "2020-08-19", 
				"abc123", "장세환", "PD0345-12", "서울시 영등포구 여의도동 20번지");
		
		order.showOrderInfo();
	}

}
