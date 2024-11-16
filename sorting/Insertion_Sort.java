package com.sorting;

public class Insertion_Sort {

	public static void main(String[] args) {
		int[] nums= {10,0,1,5,6,2,4,3,9};
		int temp;
		
		System.out.println("before sorting");		
		for (int i : nums) {
			System.out.print(i+" ");
		}System.out.println();
		
		for(int i=1;i<nums.length;i++) {
			temp=nums[i];
			
			int j=i-1;
			
			
			while(j>=0 && nums[j]>temp) {
				nums[j+1] = nums[j];
				j--;
			}
			nums[j+1]=temp;
			for (int k : nums) {
				System.out.print(k+" ");
			}System.out.println();
			}
		
		
		
		
		System.out.println("after sorting");
		for (int i : nums) {
			System.out.print(i+" ");
		}
	}

}
