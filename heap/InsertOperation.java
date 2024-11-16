package com.heap;

public class InsertOperation {

	public static void main(String[] args) {
		int[] arr= new int[10];
		arr[0]=10;
		arr[1]=5;
		arr[2]=3;
		arr[3]=2;
		arr[4]=4;
		int len=5;
		
		int key=15;
		//int key=0;
		len=Insert(arr,len,key);
		print(arr,len);

	}

	private static void print(int[] arr, int len) {
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	private static int Insert(int[] arr, int len, int key) {
		int lastElement=key;
		len=len+1;
		arr[len-1]=lastElement;		
		
		heapify(arr,len,len-1);
		return len;
	}

	private static void heapify(int[] arr, int len, int i) {
		int parent=Math.abs((i-1)/2);
		
		if(parent>=0) {
			if(arr[i]>arr[parent]) {
				int temp=arr[i];
				arr[i]=arr[parent];
				arr[parent]=temp;
				
				heapify(arr, len, parent);
			}
		}
	}

}
