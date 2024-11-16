package com.searching;

public class RecursiveMode {
	//Linear search
	public static int linear_Search(int[] nums,int target,int index) {
		
		//first case
		if(index>=nums.length)
			return -1;
		if(target== nums[index])
			return index;
	return linear_Search(nums, target, index+1);
	}
	//Binary search
	public static int binar_search(int[] nums,int target,int left,int right) {
		
		int mid;
		while(left<=right) {
			mid=(left+right)/2; //to find mid value
			
			if(target==nums[mid]) {
				return mid;  
			}
			else if (target<nums[mid]) {
				return binar_search(nums, target,left, mid - 1);
			}
			else {
				return binar_search(nums, target, mid + 1, right);
			}
		}
		
		return -1;
		
	}
	public static void main(String[] args) {
		//implementing linear and binary search in dsa
		int[] nums= {1,2,3,4,5,6};
		int target=2;
		
		//int search=binar_search(nums,target,0,nums.length-1);
		int search=linear_Search(nums,target,0);
		
		if(search != -1)
			System.out.println("element found at index :"+search+" The value is :"+nums[search]);
		else 
			System.out.println("element not found");
	}

}
