package thread;

import java.io.IOException;

public class TerminateThread extends Thread{
	
	private boolean flag = false;
	int i;
	
	public TerminateThread(String name) {
		super(name);   // 스레드 이름 받을 수 있는 생성자 
	}
	
	public void run() {
		while(!flag) {
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(getName() + " : end");
	}
	 
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public static void main(String[] args) throws IOException {
		TerminateThread threadA = new TerminateThread("A");
		TerminateThread threadB = new TerminateThread("B");
		
		threadA.start();
		threadB.start();
		
		int in;
		while(true) {
			in = System.in.read();
			if( in=='A') {
				threadA.setFlag(true);
			}else if(in=='B') {
				threadB.setFlag(true);
			} else if(in=='M') {
				threadA.setFlag(true);
				threadB.setFlag(true);
				break;
			}
			else {
				System.out.println("try again");
			}
		}
		System.out.println("main end");
	}

}
