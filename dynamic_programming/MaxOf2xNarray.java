package com.dynamic_programming;

import java.util.ArrayList;
import java.util.List;

public class MaxOf2xNarray {
	public static int maxResult() {
		
		List<List<Integer>> A=new ArrayList<List<Integer>>();
		
		List<Integer> row1= new ArrayList<Integer>();
		row1.add(2);
		row1.add(-3);
		row1.add(8);
		row1.add(5);
		row1.add(1);
		row1.add(6);
		A.add(row1);
		
		List<Integer> row2= new ArrayList<Integer>();
		row2.add(4);
		row2.add(1);
		row2.add(5);
		row2.add(2);
		row2.add(3);
		row2.add(8);
		A.add(row2);
		
		List<Integer> temp=new ArrayList<Integer>();
		
		for(int i=0;i<A.get(0).size();i++) {
			temp.add(Math.max(A.get(0).get(i),A.get(1).get(i)));
		}
		
		int[] dp=new int[temp.size()+1];
		dp[0]=0;
		dp[1]=temp.get(0);
		for(int i=2;i<=temp.size();i++) {
			int accept=temp.get(i-1)+dp[i-2];
			int reject=dp[i-1];
			dp[i]=Math.max(accept, reject);
		}
		return dp[dp.length-1];
	}
	public static void main(String[] args) {
		System.out.println(maxResult());

	}

}
