package com.dynamic_programming;

public class LCS_BOTTOM {
    private static int lcs(String str1, String str2,int m,int n) {
        int[][] dp = new int[m+1][n+1];
        //filling values in the table 
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        String str1="aggtab";
        String str2="gxtxyab";

        int m=str1.length();
        int n=str2.length();
        System.out.println(lcs(str1,str2,m,n));
    }          
}
