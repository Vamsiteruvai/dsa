package com.dynamic_programming;
class bottom_up {

    private static int knapsack(int[] values, int[] weights, int capacity) {

        int n=values.length;
        int[][] dp=new int[n+1][capacity+1];

        //fill array with values
        for(int i=1;i<=n;i++){
            for(int j=0;j<=capacity;j++){
                if(weights[i-1]<=j){    //user weights less than current weight that means 0 to 7
                    //include and exclude values
                    dp[i][j]=Math.max(dp[i-1][j],values[i-1]+dp[i-1][j-weights[i-1]]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][capacity];    
    }
    // Driver Code
    public static void main(String[] args)
    {
       int[] values={1,4,5,7};
       int[] weights={1,3,4,5};

       int capacity=7;
       int maxProfit=knapsack(values,weights,capacity);
              System.out.println(maxProfit);
    }        
}
