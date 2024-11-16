package com.dynamic_programming;

public class SumOfSquares {
	public static int sol() {
		int n=12;
		int[] dp=new int[n+1];
		dp[0]=0;
		dp[1]=1;
		for(int i=2;i<=n;i++) {
			dp[i]=i;
			for(int x=2;x*x<=i;x++) {
				dp[i]=Math.min(dp[i],1+dp[i-x*x]);
			}
		}
		return dp[n];
	}
	public static void main(String[] args) {
		System.out.println(sol());
	}

}
