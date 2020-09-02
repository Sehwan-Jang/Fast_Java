package interfaceex;

public class CompleteCalc extends Calculator{

	@Override
	public int times(int num1, int num2) {
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		
		if (num2 !=0) {
			return num1 / num2;
		} else {
			return ERROR;
		}
	}

	@Override
	public String stringAdd(String s1, String s2) {
		return s1+s2;
	}
	
	public void showInfo() {
		System.out.println("모두 구현 하였습니다.");
	}

//	@Override
//	public void description() {
//		System.out.println("재정의한 description");
//	}

	
}
