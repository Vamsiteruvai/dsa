package com.heap;

public class deleteAnyNode {

	public static void main(String[] args) {
		int[] arr= {10,5,2,3,4,11,58};   //58 5 2 3 4 11 
		int len=arr.length;
		
		int key=2;
		//len=delete_Node_At(arr,len,key);
		//System.out.println(Arrays.toString(arr));
		//len= Heap.deleteNode(arr, len);
		len= delete_Node_At(arr, len,key);
		print(arr, len);
	}

	private static int delete_Node_At(int[] arr, int len, int key) {
		int index1=findIndex(arr,len,key);
		len=len-1;
		for(int j=index1;j<len;j++) {
			arr[j]=arr[j+1];
			
		}
		heapify(arr,len,0);
		return len;
	}

	private static void heapify(int[] arr, int len, int i) {
		int largest=i;
		int left=2*i+1;
		int right=2*i+2;
		if(largest>=len) {
			return;
		}else {
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
	}

	private static int findIndex(int[] arr, int len, int key) {
		int index=0;
		for(int i=0;i<len;i++) {
			if(key==arr[i]) {
				index=i;
			}
		}
		return index;
	}
	
	private static void print(int[] arr, int len) {
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}


}
