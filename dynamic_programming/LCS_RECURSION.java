package com.dynamic_programming;

public class LCS_RECURSION {
    private static int lcs(String str1, String str2,int m,int n) {
        if(m==0||n==0){
            return 0;
        }
        if(str1.charAt(m-1)==str2.charAt(n-1)){
            return 1+lcs(str1,str2,m-1,n-1);  //if the two last characters are same than this condition
        }
        else{
            return Math.max(lcs(str1, str2, m-1, n), lcs(str1, str2, m, n-1)); //otherwise perform this condition
        }
    }
    public static void main(String[] args) {
        String str1="bd";
        String str2="abcd";

        int m=str1.length();
        int n=str2.length();
        System.out.println(lcs(str1,str2,m,n));
    }          
}
