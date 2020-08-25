package interfaceex;

public class CalcTest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println("스태틱 메서드 : "+Calc.total(arr));
		
		CompleteCalc calc = new CompleteCalc();
		int n1 =10;
		int n2 = 2;
		
		System.out.println(calc.add(n1, n2));
		System.out.println(calc.substract(n1, n2));
		System.out.println(calc.times(n1, n2));
		System.out.println(calc.divide(n1, n2));
		System.out.println(calc.stringAdd(Integer.toString(n1),Integer.toString(n2)));
		calc.showInfo();
		calc.description();
	}

}
