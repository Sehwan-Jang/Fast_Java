package stream.inputstream;

import java.io.FileInputStream;

public class FileInputTest3 {

	
	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("input2.txt")) {
			byte[] br = new byte[8];
			int i;
			while((i=fis.read(br))!=-1) {
				for(int k=0; k<i; k++) {
					System.out.print((char)br[k]);
				}
				System.out.println();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}
