package array;

public class AZprint {

	public static void main(String[] args) {
		char[] alphabet = new char[26];
		char count = 'A';
		
		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = count++;
			System.out.print(alphabet[i]+ " ");
		}
	} 

}
