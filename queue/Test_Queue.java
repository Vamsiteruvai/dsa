package com.queue;

public class Test_Queue {

	public static void main(String[] args) {
		Queue obQueue = new Queue();
		//obQueue.enQueue(12);
		obQueue.enQueue(13);
		obQueue.enQueue(14);
		obQueue.enQueue(18);
		obQueue.enQueue(16);
		obQueue.enQueue(19);
		//obQueue.deQueue();
//		obQueue.deQueue();
//		obQueue.deQueue();
//		obQueue.deQueue();
//		obQueue.deQueue();
//		obQueue.deQueue();
		//System.out.println(obQueue.isEmpty());
		//System.out.println(obQueue.isFull());
		//System.out.println(obQueue.size());
		obQueue.show();
	}

}
