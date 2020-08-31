package lambda;
@FunctionalInterface
interface PrintString{
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {
		PrintString lamdaStr = s -> System.out.println(s); //변수처럼
		lamdaStr.showString("test" );
		
		showMyString(lamdaStr);  // 람다식 변수에 대입도 되고 매개변수로도 넘어갈수도 있음
		showMyString(returnString());
	}

	public static void showMyString(PrintString p) {
		p.showString("test2");  // 매개변수
	}
	
	public static PrintString returnString() {
		return s->System.out.println(s+"!!"); //반환문
	}
}
