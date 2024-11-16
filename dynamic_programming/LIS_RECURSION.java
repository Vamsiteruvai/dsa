package com.dynamic_programming;

public class LIS_RECURSION {

    public static void main(String[] args) {
        int[] arr = {10, 22, 9, 33, 21};
        System.out.println(recur(arr));
    }
    public static int recur(int[] arr,int prev,int curr) {

        if(curr==arr.length){
            return 0;
        }
        int include=0;
        if(prev==-1 || arr[curr]>arr[prev]){
            include=1+recur(arr, curr, curr+1);
        }

        int exclude=recur(arr, prev, curr+1);
        return Math.max(include, exclude);
    }

    private static int recur(int[] arr) {
        return recur(arr,-1,0);
    }
}
