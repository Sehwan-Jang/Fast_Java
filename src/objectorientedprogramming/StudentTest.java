package objectorientedprogramming;

public class StudentTest {
	
	public static void main(String[] args) {
		Student studentJang = new Student(100, "Jang");
		studentJang.setKoreanSubject("korean", 100);
		studentJang.setMathSubject("math", 80);
		
		Student studentKim = new Student(100, "Kim");
		studentKim.setKoreanSubject("korean", 50);
		studentKim.setMathSubject("math", 100);
		
		studentJang.showStudentScore();
		studentKim.showStudentScore();
		
	}
}
