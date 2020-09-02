package interfaceex;

public interface Calc {

	double PI = 3.14;
	int ERROR = -99999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	public String stringAdd(String s1, String s2);
	
	default void description() {
		System.out.println("상수 계산기 구현");
		myMethod();
	}
	
	static int total(int[] arr) {
		int total = 0;
		
		for (int i : arr) {
			total +=i;
		}
		myStaticMethod();
		return total;
	}
	
	private void myMethod() {
		System.out.println("pricate method");
	}
	private static void myStaticMethod() {
		System.out.println("static private method");
	}
}
