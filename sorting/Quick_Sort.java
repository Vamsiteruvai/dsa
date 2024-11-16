package com.sorting;

public class Quick_Sort {
	
	static void Quick_Sort1(int[] arr, int low, int high) {
		if(low<high) {
			int pi=partition(arr,low,high);
			
			Quick_Sort1(arr,low,pi-1);
			Quick_Sort1(arr,pi+1,high);
		}
		
	}

	 static int partition(int[] arr, int low, int high) {
		int pivot=arr[high];
		int i =low-1;
		
		for(int j=low;j<=high-1;j++) {
			if(arr[j]<pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		
		swap(arr,i+1,high);
		return i+1;
	}

	 static void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}

	public static void main(String[] args) {
		int[] arr = {2,58,7,46,92,8};
		
		Quick_Sort1(arr,0,arr.length-1);
		for (int i : arr) {
			System.out.print(i +" ");
		}

	}

	 

}
