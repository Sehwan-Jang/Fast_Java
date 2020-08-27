package objectorientedprogramming;

public class Ex1Person {

	public int age, siblings;
	public String name;
	public boolean isMarried;
	
	public void showInfo() {
		System.out.println("<출력결과>");
		System.out.println("나이 : " + age);
		System.out.println("이름 : " + name);
		System.out.println("결혼여부 : " +isMarried);
		System.out.println("자녀 수 : " +siblings);
	}
}
