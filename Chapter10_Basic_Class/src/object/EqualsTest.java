package object;

class Student {
	int studentNum;
	String studentName;

	public Student(int studentNum, String studentName) {
		this.studentName = studentName;
		this.studentNum = studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student) obj;
			return (this.studentNum==std.studentNum);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentNum;
	}
	
	

}

public class EqualsTest {

	public static void main(String[] args) {
		
		Student Lee = new Student(100, "이순신");
		Student Lee2 = Lee;
		Student shin = new Student(100, "이순신");
		
		System.out.println(Lee == Lee2);
		System.out.println(Lee.equals(shin));
		
		System.out.println(Lee.hashCode());
		System.out.println(shin.hashCode());
	}

}
