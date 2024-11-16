package com.arrays;

import java.util.Arrays;

public class ArrayOperations {
	private static int find(int[] arr, int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
		
	}
		
	public static void main(String[] args) {
		int[] arr= {1,2,5,6,7,9,10,11,75,58};
		int pos=find(arr, 58);
		if(pos!=-1) {
			for(int i=pos;i<arr.length-1;i++) {
				arr[i]=arr[i+1];
			}int size=arr.length-1;
			int[] resized=Arrays.copyOf(arr, size);
			System.out.println(Arrays.toString(resized));
		}
		else {
			System.out.println("element not found");
		}
		
	}
}
