package stream.inputstream;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {
		// 이클립스 연동 안되서 cmd 창에서 실행시켜야 함 
		Console console = System.console();
		
		System.out.println("이름 : ");
		String name = console.readLine();
		System.out.println("비밀번호 : ");
		char[] password = console.readPassword();
		
		System.out.println(name);
		System.out.println(password);
	}
}
