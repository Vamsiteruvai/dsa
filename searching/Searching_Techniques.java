package com.searching;

public class Searching_Techniques {
	//Linear search
	public static int linear_Search(int[] nums,int target) {
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==target) 
				return i;
			
		}return -1;
	
	}
	//Binary search
	public static int binar_search(int[] nums,int target) {
		int left=0;
		int right=nums.length-1;
		int mid;
		while(left<=right) {
			mid=(left+right)/2; //to find mid value
			
			if(target==nums[mid]) {
				return mid;  
			}
			else if (target<nums[mid]) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
		}
		
		return -1;
		
	}
	public static void main(String[] args) {
		//implementing linear and binary search in dsa
		int[] nums= {1,2,3,4,5,6};
		int target=55;
		
		int search=binar_search(nums,target);
		
		if(search != -1)
			System.out.println("element found at index :"+search+" The value is :"+nums[search]);
		else 
			System.out.println("element not found");
	}

}
