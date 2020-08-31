package exception;


public class ResouceTest {

	public static void main(String[] args) {
		
		try(AutoCloseObj obj = new AutoCloseObj()) {
			throw new Exception();
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
