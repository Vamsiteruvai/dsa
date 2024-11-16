package com.dynamic_programming;

public class Time_and_Space {
    private static int knapsack(int[] values, int[] weights, int capacity, int n) {
        int[] dp=new int[capacity+1];
        for(int i=1;i<n+1;i++){
            for(int w=capacity;w>=0;w--){
                if(weights[i-1]<=w){
                    dp[w]=Math.max(dp[w], dp[w-weights[i-1]]+values[i-1]);
                }
            }
        }
        return dp[capacity];
    }
    public static void main(String[] args) {
        int[] values={1,4,5,7};
        int[] weights={1,3,4,5};

        int capacity=7;
        int n=values.length;
       System.out.println( knapsack(values,weights,capacity,n));
    }
}
