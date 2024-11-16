package com.sorting;

public class Merge_sort {

	public static void main(String[] args) {
		int[] arr= {2,1,5,9,6,7};
		
		Merge_sort1(arr,0,arr.length-1);
		for (int i : arr) {
			System.out.print(i+" ");
		}

	}

	private static void Merge_sort1(int[] arr, int left, int right) {
		if(left<right) {
			int midle=(left+right)/2;
			
			Merge_sort1(arr,left,midle);
			Merge_sort1(arr,midle+1,right);
			
			Merge(arr,left,midle,right);
		}
		
	}

	private static void Merge(int[] arr, int left, int midle, int right) {
		int n1=midle-left+1;
		int n2=right-midle;
		
		int[] Larr=new int[n1];
		int[] Rarr=new int[n2];
		
		System.arraycopy(arr, left, Larr, 0, n1);
        System.arraycopy(arr, midle + 1, Rarr, 0, n2);
		
		int i=0;
		int j=0;
		int k=left;
		
		while (i < n1 && j < n2) {
            if (Larr[i] <= Rarr[j]) {
                arr[k] = Larr[i];
                i++;
            } else {
                arr[k] = Rarr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray (if any)
        while (i < n1) {
            arr[k] = Larr[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray (if any)
        while (j < n2) {
            arr[k] = Rarr[j];
            j++;
            k++;
        }
    }
		
	

}
