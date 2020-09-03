package thread;

class Bank {
	private int money = 10000;
	
	public void saveMoney(int save) {
		synchronized (this) {
		int m = this.getMoney();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		setMoney(m + save);
		}
	}
	
	public synchronized void minusMoney(int minus) {
		int m = this.getMoney();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setMoney(m - minus);
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}

class Park extends Thread {
	public void run() {
		synchronized (SyncTest.myBank) {
			System.out.println("start save");
			SyncTest.myBank.saveMoney(3000);
			System.out.println("saved money : " + SyncTest.myBank.getMoney());			
		}
	}
}

class ParkWife extends Thread {
	public void run() {
		System.out.println("start minus");
		SyncTest.myBank.minusMoney(1000);
		System.out.println("minused money : " + SyncTest.myBank.getMoney());
	}
}


public class SyncTest {
	
	public static Bank myBank = new Bank();

	public static void main(String[] args) throws InterruptedException {
		Park park = new Park();
		park.start();
		
		Thread.sleep(200);
		ParkWife wife = new ParkWife();
		wife.start();

	}

}
