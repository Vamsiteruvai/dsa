package com.recursion;

public class Recursion {
	public static int calcPow(int x, int n) {
		if(n==0) {
			return 1;
		}
		if(x==0) {
			return 0;
		}
		if(n%2==0) {
			return calcPow(x, n/2)*calcPow(x, n/2);
		}
		if(n%2!=0) {
			return calcPow(x, n/2)*calcPow(x, n/2)*x;
		}
		return n;
	}
	public static void main(String[] args) {
		int x=2,n=4;
		int p=calcPow(x, n);
		System.out.println(p);	
	}
	
}
