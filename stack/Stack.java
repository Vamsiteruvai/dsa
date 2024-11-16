package com.stack;

public class Stack {
	int capacity=0;
	int[] stack = new int[4+capacity];
	int top=0;
	int size=0;	
	public void push(int data) {
		try {
			stack[top]=data;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.print("array index exceeds....");
		}
		top++;
	}
	public int size() {
		return top;		
	}
	
	public int pop() {
		int data;
		top--;
		data=stack[top];
		stack[top]=0;
		return data;
	}
	public int peek() {
		int data;
		data=stack[top-1];
		return data;
	}
	public boolean isEmpty() {
		return top<=0;
	}
	public boolean isFull() {
		int arrSize=0;
		for (int i : stack) {
			arrSize++;
		}
		return arrSize==top;
	}	
	public void print() {
		for (int i : stack) {
			System.out.print(i+" ");
		}
	}	
}
