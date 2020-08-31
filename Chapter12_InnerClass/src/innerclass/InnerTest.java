package innerclass;

class OutClass {   //외부 클래스
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass {  // 인스턴스 내부 클래스 
		int iNum =100;
		
		void inTest() {
			System.out.println(iNum);
			System.out.println(sNum);
			System.out.println(num);
		}
	}
	public void usingInner() {
		inClass.inTest();
	}
	
	static class InStaticClass { 	//내부 스태틱 클래스 
		int inNum =100;
		static int sInNum = 200;
		
		void inTest() {				
			System.out.println(inNum);
			System.out.println(sInNum);
		}
		static void sTest() {
			System.out.println(sInNum);
			System.out.println(sNum);
		}
	}
}

public class InnerTest {
	
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		outClass.usingInner();
		
		OutClass.InClass myInClass = outClass.new InClass();
		myInClass.inTest();
		System.out.println();
		
//		OutClass.InStaticClass sTinClass = new OutClass.InStaticClass();
		OutClass.InStaticClass.sTest();
	}

}
