package com.dynamic_programming;

public class LCS_MEMOIZATION {
    private static int lcs(String str1, String str2,int m,int n) {
        int[][] dp = new int[m+1][n+1];
        if(m==0||n==0){
            return 0;
        }
        if(str1.charAt(m-1)==str2.charAt(n-1)){
            return dp[m][n]=1+lcs(str1,str2,m-1,n-1);  //if the two last characters are same than this condition
        }
        else{
            return dp[m][n]=Math.max(lcs(str1, str2, m-1, n), lcs(str1, str2, m, n-1)); //otherwise perform this condition
        }
    }
    public static void main(String[] args) {
        String str1="AGGTAB";
        String str2="GXTXAYB";

        int m=str1.length();
        int n=str2.length();
        System.out.println(lcs(str1,str2,m,n));
    }          
}
