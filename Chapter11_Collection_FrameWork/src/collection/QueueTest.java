package collection;

import java.util.ArrayList;

class MyQueue {
	private ArrayList<String> queueList = new ArrayList<String>();
	
	public void enQueue(String data) {
		queueList.add(data);
	}
	
	public String deQueue() {
		int len = queueList.size();
		if(len ==0) {
			System.out.println("queue가 비었습니다.");
			return null;
		}
		return queueList.remove(0);
	}
	
	public void printQueue() {
		System.out.println(queueList);
	}
			
}

public class QueueTest {

	public static void main(String[] args) {

		MyQueue queue = new MyQueue();
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		queue.enQueue("D");
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		queue.printQueue();
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		
	}

}
