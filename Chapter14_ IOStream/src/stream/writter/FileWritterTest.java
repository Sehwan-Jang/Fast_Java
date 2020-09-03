package stream.writter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritterTest {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("writter.txt");
		fw.write('A');
		char[] buf = {'B', 'C', 'D', 'F', 'G'};
		
		fw.write(buf);
		fw.write("안녕하세요");
		fw.write(buf, 2, 2);
		fw.close();
		
		System.out.println("end");
	}

}
