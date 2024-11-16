package com.queue;

public class Queue {
	int[] queue = new int[5];
	int capacity;
	int size;
	int front;
	int rear;
	public void enQueue(int data) {
		try {
			queue[rear]=data;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("queue overflow");
		}
		rear++;
		size++;
	}
	
	public int deQueue() {
		
		int data=queue[front];
		front++;
		size--;
		return data;
//		queue[front]=0;
//		size--;
//		for(int i=0;i<size;i++) {
//			queue[i]=queue[i+1];
//			queue[i+1]=0;
//		}
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size<=0;
		
	}
	public int capacity() {
		for (int i : queue) {
			capacity++;
		}return capacity;
	}
	public boolean isFull() {
		
		return size==capacity();
	}
	public void show() {
		for(int i=0;i<size;i++) {
			System.out.print(queue[front+i]+" ");
		}
	}
}
