package com.sorting;

public class Selection_Sort {

	public static void main(String[] args) {
		int[] nums= {5,6,2,4,3,9};
		int temp;
		
		System.out.println("before sorting");
		
		for (int i : nums) {
			System.out.print(i+" ");
		}System.out.println();

		for(int i=0;i<nums.length;i++) {
			int small=i;
			for(int j=i+1;j<nums.length-1;j++) {
				if(nums[small]>nums[j]) {
					small=j;
				}
			}
			
			temp=nums[i];
			nums[i]=nums[small];
			nums[small]=temp;
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
