package com.heap;

public class Heapify {
	public static void heapify(int[] arr, int len, int i) {
		int largest=i;
		int left=2*i+1;
		int right=2*i+2;
		
		if(largest>=len) {
			return;
		}
		if(left<len && arr[left]>arr[largest]) {
			largest=left;
		}
		
		if(right<len && arr[right]>arr[largest]) {
			largest=right;
		}
		
		if(largest!=i) {
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			
			
		}
		heapify(arr, len, largest+1);
	}
	public static void main(String[] args) {
		int[] arr= {10,5,2,3,4,11,58};   //58 5 2 3 4 11 
		int len=arr.length;
		
		heapify(arr, len, 0);
		for(int i=0;i<len;i++) {
			
			System.out.print(arr[i]+" ");
		}
	}

}
