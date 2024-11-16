package com.heap;

public class Heap {

    public static void main(String[] args) {
		int[] arr= {10,5,2,3,4,11,58};
		int len=arr.length;
		
		len=deleteNode(arr,len);
		print(arr,len);
	}

	public static void print(int[] arr, int len) {
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	public static int deleteNode(int[] arr, int len) {
		int lastElement=arr[len-1];
		arr[0]=lastElement;
		
		len=len-1;
		
		heapify(arr,len,0);
		
		return len;
		
	}

	public static void heapify(int[] arr, int len, int i) {
		int largest=i;
		int left=2*i+1;
		int right=2*i+2;
		
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
			
			heapify(arr, len, largest);
		}
		
	}
}
