package com.sorting;

public class Bubble_Sort {

	public static void main(String[] args) {
		int[] nums= {5,6,2,4,3,9,54,0,8};
		System.out.println("before sorting");
		for (int i : nums) {
			System.out.print(i+" ");
		}System.out.println();
		
		
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length-1;j++) {
				int temp;
				if(nums[j]>nums[j+1]) {
					temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		}
		
		
		System.out.println("after sorting");
		for (int i : nums) {
			System.out.print(i+" ");
		}
	}

}
