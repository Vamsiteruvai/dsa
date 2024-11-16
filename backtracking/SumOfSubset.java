package com.backtracking;

import java.util.ArrayList;
import java.util.List;

public class SumOfSubset {
	public static void main(String[] args) {
		int[] arr= {1,2,1};	
		int target=3;
		//int size=arr.length;
		List<Integer> solutions= new ArrayList<Integer>();
		printsubset(arr,target,0,solutions);
	}

	private static void printsubset(int[] arr, int target, int index, List<Integer> subset) {
		
		if(target==0) {
			System.out.println(subset);
			return;
		}
		if(target<0 || index==arr.length) {
			return;
		}
		
		subset.add(arr[index]);
		printsubset(arr, target-arr[index], index+1, subset);
		
		subset.remove(subset.size()-1);
		printsubset(arr, target, index+1, subset);
		
	}
}
