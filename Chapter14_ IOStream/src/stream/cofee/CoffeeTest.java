package stream.cofee;

public class CoffeeTest {

	public static void main(String[] args) {

		Coffee americano = new KenyaAmericano();
		americano.brewing();
		System.out.println();
		
		Coffee kenyaLatte = new Mocha(new Latte(new KenyaAmericano()));
		kenyaLatte.brewing();
		
	}

}
