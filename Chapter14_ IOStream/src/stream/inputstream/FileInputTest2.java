package stream.inputstream;

import java.io.FileInputStream;

public class FileInputTest2 {

	
	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("input.txt")) {
			int i;
			while((i = fis.read()) != -1) {
				System.out.println(i);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println("end");
	}

}
